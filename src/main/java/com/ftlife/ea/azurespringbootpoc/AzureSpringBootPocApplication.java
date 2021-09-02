package com.ftlife.ea.azurespringbootpoc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.ftlife.ea.azurespringbootpoc.exception.ExitException;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class AzureSpringBootPocApplication implements CommandLineRunner {
	
	@Override
	public void run(String... args) {

		if (args.length > 0 && args[0].equals("exitcode")) {
			throw new ExitException();
		}
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AzureSpringBootPocApplication.class, args);
	}

}
