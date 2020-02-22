package com.bihuniak.educator;

import com.bihuniak.educator.basic.Car;
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
		Car car = new Car(0, "A4", "AUDI", 4, 3465d, false);
		myFirstRepository.saveAll(asList(car));
	}
}
