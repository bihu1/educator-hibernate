package com.bihuniak.educator;

import com.bihuniak.educator.basic.Cars;
import com.bihuniak.educator.basic.MyFirstRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import static java.util.Arrays.asList;

@SpringBootApplication
public class EducatorApplication {

	@Autowired
	private MyFirstRepository myFirstRepository;

	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Cars cars = new Cars();
		Cars cars1 = new Cars( "Audi",4,3.8,true);
		Cars cars2 = new Cars("BMW",4,2.8,false);
//		myFirstRepository.save(cars);
//		myFirstRepository.save(cars1);
//		myFirstRepository.save(cars2);
		myFirstRepository.saveAll(asList(cars));

	}
}
