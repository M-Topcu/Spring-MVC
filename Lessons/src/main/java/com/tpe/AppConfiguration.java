package com.tpe;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tpe") //=> bu package`in altini tarayacak, default`u bulundugu package
public class AppConfiguration {

}
