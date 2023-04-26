package com.tpe.repository;

import com.tpe.domain.Message;

public class FileRepository implements Repository {

	@Override
	public void saveMessage(Message message) {
		System.out.println("Message is saving in File Repository: " + message.getMessage());

	}

}
