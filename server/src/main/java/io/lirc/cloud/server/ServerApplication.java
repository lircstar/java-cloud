package io.lirc.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String profiles = scan.nextLine();
		//SpringApplication.run(ServerApplication.class, args);
		new SpringApplicationBuilder(ServerApplication.class).profiles(profiles).run(args);
	}
}
