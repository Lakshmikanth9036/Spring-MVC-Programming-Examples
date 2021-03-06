package com.Biditvats.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(SpringMvcConfig.class);
		context.setServletContext(container);
		
		ServletRegistration.Dynamic reDynamic = container.addServlet("dispatcher", new DispatcherServlet(context));
		reDynamic.addMapping("/");
		reDynamic.setLoadOnStartup(1);
	}

}
