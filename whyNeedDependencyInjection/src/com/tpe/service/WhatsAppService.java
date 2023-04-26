package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.Repository;

public class WhatsAppService implements MessageService{
	
	Repository repository;
	
	public WhatsAppService(Repository repository) {
		this.repository = repository;
	}
	
	@Override
	public void sendMessage(Message message) {
		System.out.println("I am a WhatsApp service, I am sending a message: " + message.getMessage());
		repository.saveMessage(message);
	}

}
