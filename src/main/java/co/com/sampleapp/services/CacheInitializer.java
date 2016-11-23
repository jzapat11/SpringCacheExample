package co.com.sampleapp.services;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CacheInitializer {
	
	@Autowired
	private Services services;
	
	@PostConstruct
	private void initializeCache() {
		System.out.println("Initializing cache objets");
		services.getCountries();
		services.getPaymentMethods();
	}
}
