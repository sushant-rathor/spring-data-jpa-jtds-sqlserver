package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.CustomTable2;
import com.example.demo.entity.CustomTable2PK;
import com.example.demo.repository.CustomTableRepository;

@SpringBootApplication
public class DemoApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}
	
	@Bean
	CommandLineRunner Demo(CustomTableRepository repository) {
		long value = System.currentTimeMillis();
		repository.save(new CustomTable2(new CustomTable2PK("1", new Date(value)), 1, "one"));
		repository.save(new CustomTable2(new CustomTable2PK("2", new Date(value)), 2, "two"));
		repository.save(new CustomTable2(new CustomTable2PK("3", new Date(value)), 3, "three"));
		repository.save(new CustomTable2(new CustomTable2PK("4", new Date(value)), 4, "four"));
		
		List<CustomTable2> data = repository.findByDataString("three");
		if(data != null && !data.isEmpty()) {
			System.out.println(data.get(0).toString());
		}
		CustomTable2PK id = new CustomTable2PK("2", new Date(value));
		CustomTable2 data2 = repository.findOne(id);
		System.out.println(data2.toString());
		
		return null;
	}
}
