package com.fran.oauth;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class SpringOAuth2Server implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(SpringOAuth2Server.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringOAuth2Server.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		log.info("Starting up things");


		log.info("End of starting up app");

	}
}
