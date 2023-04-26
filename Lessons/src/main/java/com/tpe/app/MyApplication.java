package com.tpe.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tpe.AppConfiguration;
import com.tpe.domain.Message;
import com.tpe.service.MessageService;

public class MyApplication {

	public static void main(String[] args) {
		
		String serviceName="mailService";
		serviceName = args.length>0 ? args[0] : serviceName;
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		MessageService messageService = context.getBean(serviceName,MessageService.class);
		//No qualifying bean of type 'com.tpe.service.MessageService' available: 
		//expected single matching bean but found 3: mailService,SMSService,whatsAppService
		
		Message message = new Message();
		message.setMessage("Your order was sent");
		messageService.sendMessage(message);
		
		context.close();
	}

}
