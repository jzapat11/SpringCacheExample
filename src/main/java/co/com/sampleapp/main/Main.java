package co.com.sampleapp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[]){

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:app-context.xml");
//		Services services = applicationContext.getBean(Services.class);
//		
//		System.out.println("Testing cache for countries");
//		System.out.println(services.getCountries().size());
//		System.out.println(services.getCountries().size());
//		System.out.println(services.getCountries().size());
//		System.out.println(services.getCountries().size());
//		
//		System.out.println("Values");
//		for (String item : services.getCountries()) {
//			System.out.println(item);
//		}
//		
//		
//		System.out.println("Testing cache for payment methods.");
//		System.out.println(services.getPaymentMethods().size());
//		System.out.println(services.getPaymentMethods().size());
//		System.out.println(services.getPaymentMethods().size());
//		System.out.println(services.getPaymentMethods().size());
//		
//		System.out.println("Values");
//		for (String item : services.getPaymentMethods()) {
//			System.out.println(item);
//		}
		
		//Closing resource.
		((ClassPathXmlApplicationContext)applicationContext).close();
		
	}
}
