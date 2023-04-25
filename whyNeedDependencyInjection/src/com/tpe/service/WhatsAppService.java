package com.tpe.service;

public class WhatsAppService implements MessageService{
	
	@Override
	public void sendMessage() {
		System.out.println("I am a WhatsApp service, I am sending a message");
	}

}
