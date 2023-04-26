package com.tpe.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tpe.AppConfiguration;
import com.tpe.service.MessageService;

public class MyApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		MessageService messageService = context.getBean(MessageService.class);
		messageService.sendMessage();
		
		context.close();
	}

}
