package com.tpe.main;

import com.tpe.domain.Message;
import com.tpe.repository.DBRepository;
import com.tpe.repository.FileRepository;
import com.tpe.repository.Repository;
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
		String repositoryName = "dbRepository";
		
		if(args.length>0) {
			serviceName=args[0];
			repositoryName = args[1];
		}
		
		MessageService messageService = null;
		Repository repository = null;
		
		repository = repositoryName.equalsIgnoreCase("fileRepository")? new FileRepository() : new DBRepository();
		
		if (serviceName.equalsIgnoreCase("WhatsAppService")) {
			messageService=new WhatsAppService(repository);
			messageService.sendMessage(message);
		} else if (serviceName.equalsIgnoreCase("SMSService")) {
			messageService=new SMSService(repository);
			messageService.sendMessage(message);
		}else {
			messageService = new MailService(repository);
			messageService.sendMessage(message);
		}
		

	}

}
