package com.slokam.sc;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class RefreshApplicationContextListener 
 implements ApplicationListener<ContextRefreshedEvent>{

	 @Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		System.out.println("ContextRefreshedEvent");
	}
	 
}
