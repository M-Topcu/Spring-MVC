package com.tpe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.tpe.thirdParty.ThirdPartyRepository;

@Configuration
@ComponentScan("com.tpe") //=> bu package`in altini tarayacak, default`u bulundugu package
@PropertySource("classpath:application.properties")
public class AppConfiguration {
	
	@Bean
	public ThirdPartyRepository thirdPartyComponent() {
		return new ThirdPartyRepository();
	}

}
