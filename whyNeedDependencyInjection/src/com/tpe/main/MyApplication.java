package com.tpe.main;

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
		
		String serviceName = "mailService";
		if(args.length>0) {
			serviceName=args[0];
		}
		
		MessageService messageService = null;
		
		if (serviceName.equalsIgnoreCase("WhatsAppService")) {
			messageService=new WhatsAppService();
			messageService.sendMessage();
		} else if (serviceName.equalsIgnoreCase("SMSService")) {
			messageService=new SMSService();
			messageService.sendMessage();
		}else {
			messageService = new MailService();
			messageService.sendMessage();
		}
		

	}

}
