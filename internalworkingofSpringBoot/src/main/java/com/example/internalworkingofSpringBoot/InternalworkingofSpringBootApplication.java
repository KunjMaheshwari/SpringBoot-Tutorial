package com.example.internalworkingofSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternalworkingofSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InternalworkingofSpringBootApplication.class, args);
	}

    private final PaymentService paymentService;

    // this is a constructor dependency injection
    public InternalworkingofSpringBootApplication(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void run(String... args) throws Exception {
        String payment = paymentService.pay();
        System.out.println("payment done successfully: " + payment);
    }
}