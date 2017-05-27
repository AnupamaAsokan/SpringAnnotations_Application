package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class PingCoachFortuneService implements FortuneService {

	private String fileName = "/Users/anupama/Desktop/FortuneFile.txt";
	private List<String> fortuneList = new ArrayList<String>();
	private Random random = new Random();
	String fortune =null;
	
	public String getFortune() {
		File myFile = new File(fileName);
		
		//check the file
		System.out.println("Reading fortunes from file: " + myFile);
		System.out.println("File exists: " + myFile.exists());
		
		//read from the file
		try (BufferedReader br = new BufferedReader(new FileReader(myFile))) {
			String tempLine;
			while ((tempLine = br.readLine()) != null) {
				fortuneList.add(tempLine);
				int number = random.nextInt(fortuneList.size());
				fortune = fortuneList.get(number);
				System.out.println("Fortune: " + fortune);
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return fortune;
	}

}
