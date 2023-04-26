package com.tpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tpe.domain.Message;
import com.tpe.repository.Repository;

@Component
@Qualifier("smsService")
public class SMSService implements MessageService{

	@Autowired
	@Qualifier("fileRepository")
	private Repository repository;
	
	@Override
	public void sendMessage(Message message) {
		System.out.println("I am an SMS Servise, I am sending a message: " + message.getMessage());
		repository.saveMessage(message);
	}

}
