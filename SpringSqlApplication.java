package com.alfaris.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSqlApplication {
	
	private static Logger logger = LogManager.getLogger(SpringSqlApplication.class);

	public static void main(String[] args) {
		
		String str= "\u001B[31m  __\u001B[0m    _     ____   __    ___   _   __  \n"+
					"\u001B[31m / /\\\u001B[0m  | |   | |_   / /\\  | |_) | | ( (` \n"+
					"\u001B[31m/_/--\\\u001B[0m |_|__ |_|   /_/--\\ |_| \\ |_| _)_) \n";

		System.out.println(str);
		SpringApplication.run(SpringSqlApplication.class, args);

	}

}
