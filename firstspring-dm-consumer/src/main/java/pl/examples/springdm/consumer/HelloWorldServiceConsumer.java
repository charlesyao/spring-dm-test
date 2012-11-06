package pl.examples.springdm.consumer;

import javax.annotation.PostConstruct;

import pl.examples.springdm.services.HelloWorldService;

public class HelloWorldServiceConsumer {
	private HelloWorldService helloWorldService;
	
	@PostConstruct
	public void hello() {
		System.out.println("servicing ..........");
		System.out.println(helloWorldService.sayHello());
	}

	public HelloWorldService getHelloWorldService() {
		return helloWorldService;
	}

	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	
}
