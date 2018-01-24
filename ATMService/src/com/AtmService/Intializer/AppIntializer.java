package com.AtmService.Intializer;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.AtmService.Resource.ATMService;

@ApplicationPath("/api")
public class AppIntializer extends Application{
Set<Class<?>> classes=null;
	public AppIntializer() {
		classes=new HashSet<>();
		System.out.println("Init");
	}

	@Override
	public Set<Class<?>> getClasses() {
	classes.add(ATMService.class);
		return classes;
	}
	
}
