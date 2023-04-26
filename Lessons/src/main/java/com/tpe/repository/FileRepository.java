package com.tpe.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tpe.domain.Message;

@Component
@Qualifier("fileRepository")
public class FileRepository implements Repository {

	@Override
	public void saveMessage(Message message) {
		System.out.println("Message is saving in File Repository: " + message.getMessage());

	}

}
