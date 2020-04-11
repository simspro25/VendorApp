package com.infospan.vendor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.infospan.vendor.entities.Vendor;
import com.infospan.vendor.repos.VendorRepository;

@SpringBootTest
class VendorAppApplicationTests {

	@Autowired
	private VendorRepository repository;

	@Test
	public void testCreateVendor() {
		Vendor v=new Vendor();
		v.setName("Tomcat");
		v.setEmail("tom@yahoo.com");
		v.setPhone("8855024550");
		 Vendor savedVendor  = repository.save(v);
		 System.out.println( "save vendor with Id:" + savedVendor.getId());
	}
	
	
	public  VendorRepository getRepository() {
		return repository;	
	}
		public void setRepository(VendorRepository repository) {
			this.repository = repository;
	}
}

