package com.bihuniak.educator;

import com.bihuniak.educator.basic.Car;
import com.bihuniak.educator.basic.MyFirstRepository;
import com.bihuniak.educator.human.Address;
import com.bihuniak.educator.human.Human;
import com.bihuniak.educator.human.HumanRepository;
import com.bihuniak.educator.human.Sex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import java.time.LocalDate;
import java.util.*;

import static java.util.Arrays.asList;

@SpringBootApplication
public class EducatorApplication {

	@Autowired
	private MyFirstRepository myFirstRepository;

	@Autowired
	private HumanRepository humanRepository;

	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Human janusz = new Human(0,
			"Janusz",
			"Tkacz",
			Sex.SECRET,
			LocalDate.of(1980, 5,5),
			new Address("Waganowa", "Wroclaw", "POLAND", "44-444")
		);
		humanRepository.save(janusz);

	}
}