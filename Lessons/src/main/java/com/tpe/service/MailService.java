package com.tpe.service;

import org.springframework.stereotype.Component;

@Component

public class MailService implements MessageService{
	
	@Override
	public void sendMessage() {
		System.out.println("I am a mail service, I am sending message");
	}

}
