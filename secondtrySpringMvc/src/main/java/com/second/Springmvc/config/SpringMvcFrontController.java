package com.second.Springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.second.Springmvc.config.AppConfig;

public class SpringMvcFrontController extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{
			AppConfig.class
		};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/"};
	}

}
