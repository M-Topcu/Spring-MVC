package com.tpe.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.tpe.domain.Message;
import com.tpe.repository.Repository;
import com.tpe.thirdParty.ThirdPartyRepository;

@Component
//@Scope("prototype") // defaultu singelton
@Qualifier("mailService")// bunun yerine @Component`i kullanarak da isim verebiliriz bean`e
//injection yaparken component ismi de kullanilabilir Qualifier da. Ancak getBean yaparken Comp. kullanilmali
public class MailService implements MessageService{
	
	private Repository repository;
	
	
	//Constructor injection
	//Eger bir adet constructoriniz varsa @Autowired kullanmaya gerek yok
	//Ancak birden fazlaysa kullanilmali
	// En verimlisi const. injection
	@Autowired
	public MailService(@Qualifier("dbRepository") Repository repository) {
		this.repository = repository;
	}


	//field injection
//	@Autowired
//	@Qualifier("dbRepository")
//	private Repository repository;
	
	
	//Setter Injection
//	@Autowired
//	public void setRepository(Repository repository) {
//		this.repository=repository;
//	}
	
	@Autowired
	ThirdPartyRepository thirdPartyRepository;
	
	@Value("${app.email}")
	private String email;
	
	@Override
	public void sendMessage(Message message) {
		System.out.println("I am a mail service, I am sending message to: "+ email + " : " + message.getMessage());
		
		thirdPartyRepository.save(message);
		
		repository.saveMessage(message);
	}
	
	//obje olusmadan hemen once calistirir
	@PostConstruct
	public void init() {
		System.out.println("Initializing");
	}
	
	//obje yok olmadan once calisir, prototype`da obje yok olmaz bu yuzden calismaz
	@PreDestroy
	public void destroy() {
		System.out.println("Destroying");
	}

}
