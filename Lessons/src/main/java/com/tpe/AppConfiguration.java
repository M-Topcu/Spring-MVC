package com.tpe;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.tpe.thirdParty.ThirdPartyRepository;

@Configuration
@ComponentScan("com.tpe") //=> bu package`in altini tarayacak, default`u bulundugu package
@PropertySource("classpath:application.properties")
public class AppConfiguration {
	
	@Autowired
	Environment environment;
	
	@Bean
	public ThirdPartyRepository thirdPartyComponent() {
		return new ThirdPartyRepository();
	}
	
	@Bean
	public Properties properties() {
		Properties properties = new Properties();
		properties.put("email", environment.getProperty("app.email"));
	//	properties.put("JAVA_HOME", environment.getProperty("JAVA_HOME"));// hata veriyor sanirim Java18 kaynakli
		return properties;
	}

}
