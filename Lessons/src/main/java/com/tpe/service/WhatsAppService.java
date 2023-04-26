package com.tpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tpe.domain.Message;
import com.tpe.repository.Repository;

@Component
@Qualifier("whatsAppService")
public class WhatsAppService implements MessageService{
	
	@Value("${app.count}")
	private int count;
	
	@Autowired
	@Qualifier("dbRepository")
	private Repository repository;

	@Override
	public void sendMessage(Message message) {
		System.out.println("I am a WhatsApp service, I am sending a message to " + count + " person: " + message.getMessage());
		repository.saveMessage(message);
	}

}
