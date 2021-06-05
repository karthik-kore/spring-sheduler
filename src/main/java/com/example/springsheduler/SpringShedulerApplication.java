package com.example.springsheduler;

import org.graalvm.compiler.core.GraalCompiler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.util.Date;
@EnableScheduling
@SpringBootApplication
public class SpringShedulerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringShedulerApplication.class, args);
	}
	@Scheduled(cron = "*/5 * * * * *")
	void job() throws InterruptedException {
	    System.out.println("Now the time is :" + new Date());
		Thread.sleep(1000);

	}
}

