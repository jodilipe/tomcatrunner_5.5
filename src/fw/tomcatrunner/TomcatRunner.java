package fw.tomcatrunner;

import java.io.*;
import java.lang.reflect.*;
import java.net.*;
import java.util.*;

public class TomcatRunner {
	private String tomcatHome;
	private String tomcatClass;
	private int tomcatStopperPort;
	private String tomcatArguments;

	public TomcatRunner(java.lang.String[] args) {
		init();
		stopTomcat();
		if (!(args.length > 0 && args[0].equalsIgnoreCase("noconfig"))) {
			new TomcatConfigurator().setup(tomcatHome);
		}
		startTomcat();
	}

	private void init() {
		tomcatHome = calculateTomcatHome();
		ResourceBundle bundle = ResourceBundle.getBundle("tomcat_runner");
		System.setProperty(bundle.getString("tomcat_home_key"), tomcatHome);
		tomcatStopperPort = Integer.parseInt(bundle.getString("tomcat_stopper_port"));
		tomcatArguments = bundle.getString("tomcat_arguments");
		tomcatClass = bundle.getString("tomcat_class");
	}

	private String calculateTomcatHome() {
		File file = new File(getClass().getResource("/tomcat_runner.properties").getFile()).getParentFile().getParentFile();
		file = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory() && pathname.getName().equalsIgnoreCase("tomcathome");
			}
		})[0];
		return file.getAbsolutePath();
	}

	private void stopTomcat() {
		try {
			if (isOnline()) {
				System.out.println("Tomcat running.......invoking stopper");
				Socket socket = new Socket("localhost", tomcatStopperPort);
				socket.close();
				Thread.sleep(150);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean isOnline() {
		try {
			Socket socket = new Socket("localhost", 8080);
			socket.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private void startStopperListener() {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					ServerSocket server = new ServerSocket(tomcatStopperPort);
					server.accept();
					server.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.exit(0);
			}
		}, "Tomcat stopper listener");
		t.setDaemon(true);
		t.start();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void startTomcat() {
		try {
			Class cls = Class.forName(tomcatClass);
			if (cls != null) {
				Method main = cls.getMethod("main", new Class[] { new String[] {
					}
					.getClass()
				});
				if (main != null) {
					StringTokenizer st = new StringTokenizer(tomcatArguments, " ");
					String[] args = new String[st.countTokens()];
					int i = 0;
					while (st.hasMoreTokens()) {
						args[i++] = st.nextToken();
					}
					startStopperListener();
					main.invoke(null, new Object[] { args });
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Unable to find the class " + tomcatClass);
			System.out.println("Set properties as described in this class'javadoc.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(java.lang.String[] args) {
		new TomcatRunner(args);
	}
}