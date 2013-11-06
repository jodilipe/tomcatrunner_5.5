package fw.tomcatrunner;

import org.apache.regexp.*;

import java.io.*;
import java.util.*;

public class TomcatConfigurator {
	private static final String contextStr = "<Context path='/#name#' docBase='#docbase#' debug='#debug#' crossContext='true' reloadable='true'><Logger className='org.apache.catalina.logger.FileLogger' prefix='localhost_#name#_log.' suffix='.txt' timestamp='true'/></Context>";
	private String xml;

	private void loadDefaultServerXml() throws IOException {
		File serverXml = new File(getClass().getResource("/server.xml").getPath());
		char[] buf = new char[(int) serverXml.length()];
		FileReader fr = new FileReader(serverXml);
		fr.read(buf);
		fr.close();
		xml = new String(buf);
	}

	private void saveServerXml(String tomcatHome) throws IOException {
		File serverXml = new File(new File(tomcatHome).getAbsolutePath() + "/conf/server.xml");
		FileWriter fw = new FileWriter(serverXml);
		fw.write(xml);
		fw.close();
	}

	private void addContext(String name, File docBase, String debug) {
		System.out.println("Adding context for webapp \"" + name + "\"");
		try {
			String context = new RE("#name#").subst(contextStr, name);
			context = new RE("#docbase#").subst(context, docBase.getAbsolutePath().replace('\\', '/'));
			context = new RE("#debug#").subst(context, debug);
			xml = new RE("<!--dynamic context -->").subst(xml, context, RE.REPLACE_FIRSTONLY);
		} catch (RESyntaxException e) {
			System.out.println("Error adding context for webapp \"" + name + "\"");
		}
	}

	private void searchPath(File path) {
		if (!path.getName().equalsIgnoreCase("tomcathome")) {
			File[] files = path.listFiles(new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					return pathname.isDirectory();
				}
			});
			if (files != null) {
				for (int i = 0; i < files.length; i++) {
					File file = files[i];
					if (file.getName().equals("WEB-INF")) {
						addContext(getWebappName(file), path, "3");
					} else {
						searchPath(file);
					}
				}
			}
		}
	}

	private String getWebappName(File file) {
		return file.getParentFile().getName().equalsIgnoreCase("workspace") ? file.getName() : getWebappName(file.getParentFile());
	}

	public void setup(String tomcatHome) {
		try {
			loadDefaultServerXml();
			String classpath = System.getProperty("java.class.path");
			StringTokenizer st = new StringTokenizer(classpath, File.pathSeparator);
			while (st.hasMoreTokens()) {
				searchPath(new File(st.nextToken()));
			}
			saveServerXml(tomcatHome);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
