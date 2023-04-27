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

		MessageService messageService2 = context.getBean(serviceName,MessageService.class);
		
		if(messageService==messageService2) {
			System.out.println("Same object reference");
		}else {
			System.out.println("Different object reference");
		}
		// Same object refenence cunku default singleton bean
		// prototype yaparsak farkli beanler olusur
		
		
		//No qualifying bean of type 'com.tpe.service.MessageService' available: 
		//expected single matching bean but found 3: mailService,SMSService,whatsAppService
		//Qualifier annotationu eklemeyince imp. edilmis hangi classtan bean alacagini bilemedi
		
		
		Message message = new Message();
		message.setMessage("Your order was sent");
		messageService.sendMessage(message);
		
		
		System.out.println("-----------------------------------------------------------");
		
		String[] beanList = context.getBeanDefinitionNames();
		for (String beanName : beanList) {
			System.out.println(beanName);
		}
		
				
		
		context.close();
	}

}
