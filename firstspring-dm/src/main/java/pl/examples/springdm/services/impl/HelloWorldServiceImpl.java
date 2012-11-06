package pl.examples.springdm.services.impl;

import pl.examples.springdm.services.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

	public HelloWorldServiceImpl() {
		System.out.println("Createing this shipt");
	}
	
	@Override
	public String sayHello() {
		System.out.println("Saying hello to word");
		return "hello";
	}

}
