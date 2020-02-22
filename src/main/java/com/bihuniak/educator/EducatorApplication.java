package com.bihuniak.educator;

import com.bihuniak.educator.basic.Car;
import com.bihuniak.educator.basic.MyFirstRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import java.util.*;

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
//		Car car = new Car(0, "A4", "AUDI4", 3, 3465d, false);
//		Car car2 = new Car(0, "A5", "AUDI3", 2, 5465d, true);
//		Car car3 = new Car(0, "A6", "AUDI2", 1, 4565d, true);
//		Car car4 = new Car(0, "A7", "AUDI1", 4, 5675d, false);
//		myFirstRepository.saveAll(asList(car, car2, car3, car4));

		Car car = myFirstRepository.findById(8L).get();
		System.out.println(car);
	}
}