package com.promineotech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = { ComponentScanMarker.class })
public class JeepSalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JeepSalesApplication.class, args);
	}

}
