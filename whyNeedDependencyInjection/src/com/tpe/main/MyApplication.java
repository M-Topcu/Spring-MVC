package com.tpe.main;

import com.tpe.domain.Message;
import com.tpe.service.MailService;
import com.tpe.service.MessageService;
import com.tpe.service.SMSService;
import com.tpe.service.WhatsAppService;

public class MyApplication {

	public static void main(String[] args) {
//      Tek tek vermek makul degil
		
//		MessageService mailService = new MailService();
//		mailService.sendMessaje();
//		
//		MessageService whatsAppService = new WhatsAppService();
//		whatsAppService.sendMessage();
		
//		MessageService smsService = new SMSService();
//		smsService.sendMessage();
		
//==============================================================================
	
//		If else vermek de cok makul degil 
		
		Message message = new Message();
		message.setMessage("Your order sent");
		
		String serviceName = "mailService";
		if(args.length>0) {
			serviceName=args[0];
		}
		
		MessageService messageService = null;
		
		if (serviceName.equalsIgnoreCase("WhatsAppService")) {
			messageService=new WhatsAppService();
			messageService.sendMessage(message);
		} else if (serviceName.equalsIgnoreCase("SMSService")) {
			messageService=new SMSService();
			messageService.sendMessage(message);
		}else {
			messageService = new MailService();
			messageService.sendMessage(message);
		}
		

	}

}
