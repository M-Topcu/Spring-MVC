package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.FileRepository;
import com.tpe.repository.Repository;

public class SMSService implements MessageService{
	
	Repository repository;
	
	public SMSService() {
		repository = new FileRepository();
	}
	
	@Override
	public void sendMessage(Message message) {
		System.out.println("I am an SMS Servise, I am sending a message" + message.getMessage());
		repository.saveMessage(message);
	}

}
