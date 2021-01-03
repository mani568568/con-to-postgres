package com.m.g.c2p;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(UtilApplication.class);
	}

    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
 
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }
}
