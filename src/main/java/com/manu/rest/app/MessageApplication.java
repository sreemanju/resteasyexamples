package com.manu.rest.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.manu.rest.service.MessageService;

@ApplicationPath("/v1")
public class MessageApplication extends Application{
	
	private Set<Object> singletons = new HashSet<Object>();
	
	public MessageApplication() {
		singletons.add(new MessageService());
	}
	
	
	@Override
	public Set<Object> getSingletons(){
		return singletons;
	}

}
