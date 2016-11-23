package co.com.sampleapp.tests;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.com.sampleapp.services.CacheInitializer;
import co.com.sampleapp.services.Services;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:app-context.xml")
public class CacheInitializerTest {
	
	@Autowired
	private Services services;
	
	@Autowired
	private CacheInitializer cacheInitializer;
	
	@Autowired
	private CacheManager cacheManager;
	
	@Test
	public void cacheLoaderTest(){
		
		//First time goes to the service to retrieve the data.
		List<String> countriesFromService =  services.getCountries();
		//Second call the data is coming from the cache.
		List<String> countriesFromCache = services.getCountries();
		
		Assert.assertSame("Collection size are different", countriesFromService.size(), countriesFromCache.size());
		
//		Cache countriesCache =  cacheManager.getCache("countries");
//		
//		System.out.println(countriesCache.get(new SimpleKey()));
//		
//		Assert.assertNotNull("Object not loaded", countriesCache.get(new SimpleKey()));
//		
//		Cache paymenetMethodCache =  cacheManager.getCache("paymentMethod");
//		Assert.assertNotNull("Object not loaded", paymenetMethodCache.get(new SimpleKey()));
		
	}
}
