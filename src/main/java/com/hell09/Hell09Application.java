package com.hell09;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.util.Assert;

import com.google.common.base.Preconditions;

@SpringBootApplication
public class Hell09Application {

	public static void main(String[] args) {
//		SpringApplication.run(Hell09Application.class, args);
		
//		Assert.notNull("");
//		Assert.notNull("", "");
//		Preconditions.checkNotNull("");
		
		SpringApplication springApplication = new SpringApplication(Hell09Application.class);
//		springApplication.setBanner(Banner.Mode);
//		springApplication.addInitializers(initializers);
		springApplication.run(args);
	}

}
