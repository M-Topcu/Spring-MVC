package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.Repository;

public class SMSService implements MessageService{
	
	Repository repository;
	
	public SMSService(Repository repository) {
		this.repository = repository;
	}
	
	@Override
	public void sendMessage(Message message) {
		System.out.println("I am an SMS Servise, I am sending a message: " + message.getMessage());
		repository.saveMessage(message);
	}

}
