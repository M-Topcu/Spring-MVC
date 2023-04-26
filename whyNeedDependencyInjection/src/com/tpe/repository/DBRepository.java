package com.tpe.repository;

import com.tpe.domain.Message;

public class DBRepository implements Repository {

	@Override
	public void saveMessage(Message message) {
		System.out.println("Message is saving in DB Repository: " + message.getMessage());

	}

}
