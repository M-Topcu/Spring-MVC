package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.Repository;

public class MailService implements MessageService{
	
	Repository repository;
	
	public MailService(Repository repository){
		//MailService`in Repository`e ihtiyaci var
		this.repository = repository;
		
		//maintance zor, hardcoded
		//repository = new DBRepository;
	}
	
	@Override
	public void sendMessage(Message message) {
		System.out.println("I am a mail service, I am sending message: " + message.getMessage());
		
		//Gonderilen message`i ayni zamanda kaydetmek istiyrum. 
		//Bu nedenle  bir saveMessage`i cagirmaya ihtiyacim var. 
		//saveMessage`i kimin uzerinden kullaniyorum: Repository
		repository.saveMessage(message);
	}

}
