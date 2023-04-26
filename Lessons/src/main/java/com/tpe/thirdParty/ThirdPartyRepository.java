package com.tpe.thirdParty;

import com.tpe.domain.Message;

public class ThirdPartyRepository {
	
	public void save(Message message) {
		System.out.println("I am a saving message in ThirdPartyRepository: " + message.getMessage());
	}

}
