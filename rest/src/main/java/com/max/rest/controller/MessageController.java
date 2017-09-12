package com.max.rest.controller;

import java.util.concurrent.atomic.AtomicLong;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.max.rest.domain.Greeting;

@RestController
public class MessageController {
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/hello")
	public Greeting greeting(@RequestParam(value="name",
		defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet(),"Hello " + name);
	}

}
