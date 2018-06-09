package io.lirc.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaClient
public class ProviderApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String port = scan.nextLine();
		//SpringApplication.run(ProviderApplication.class, args);
		new SpringApplicationBuilder(ProviderApplication.class).properties(
				"server.port=" + port).run(args);
	}
}
