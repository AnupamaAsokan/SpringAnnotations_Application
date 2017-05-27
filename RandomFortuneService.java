package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//array of strings
	public String[] data ={"Great day", "Lucky Day" , "Tiring Day" };
	//Random creation
	Random random = new Random();
	
	public String getFortune() {
		int number = random.nextInt(data.length);
		String theFortune = data[number];
		return theFortune;
	}

}
