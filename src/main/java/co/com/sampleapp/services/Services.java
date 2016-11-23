package co.com.sampleapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class Services {
	
	@Cacheable("countries")
	public List<String> getCountries(){
		System.out.println("Retrieving Countries..");
		List<String> countries = new ArrayList<String>();
		countries.add("Colombia");
		countries.add("Argentina");
		countries.add("EE.UU");
		
		return countries;
	}
	
	@Cacheable("paymentMethods")
	public List<String> getPaymentMethods(){
		System.out.println("Retrieving Payment Methods..");
		List<String> paymentMethods = new ArrayList<String>();
		paymentMethods.add("Cash");
		paymentMethods.add("Credit Card");
		paymentMethods.add("Paypal");
		
		return paymentMethods;
	}
}
