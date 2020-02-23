package com.bihuniak.educator;

import com.bihuniak.educator.basic.Car;
import com.bihuniak.educator.basic.MyFirstRepository;
import com.bihuniak.educator.human.Human;
import com.bihuniak.educator.human.HumanRepository;
import com.bihuniak.educator.human.Sex;
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

	@Autowired
	private HumanRepository humanRepository;

	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Human janusz = new Human(0, "Janusz", "Tkacz", Sex.SECRET, new Date(1980, 10, 10));
		humanRepository.save(janusz);

	}
}