package com.rest.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.rest.bean.HelloBean;
import com.rest.controller.SumController;

@Configuration
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig () {
		register(SumController.class);
		register(HelloBean.class);
		register(MultiPartFeature.class);
	}
}
