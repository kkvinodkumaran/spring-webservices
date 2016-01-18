package com.vinod.vinod_spring_test;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class JettyWebserviceStart {

	public static void main(String[] args) {
		final AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(MyWebServiceSpringConfig.class);
		final ServletHolder servletHolder = new ServletHolder(new DispatcherServlet(applicationContext));
		final ServletContextHandler context = new ServletContextHandler();
		context.setContextPath("/");
		context.addServlet(servletHolder, "/*");
		final Server server = new Server(8080);
		server.setHandler(context);
		try {
			server.start();
			server.join();
		} catch (Exception e) {
			server.destroy();
			e.printStackTrace();
		} 
	}

}
