package com.bihuniak.educator;

import com.bihuniak.educator.basic.Car;
import com.bihuniak.educator.basic.MyFirstRepository;
import com.bihuniak.educator.company.Department;
import com.bihuniak.educator.company.DepartmentRepository;
import com.bihuniak.educator.company.Employee;
import com.bihuniak.educator.company.EmployeeRepository;
import com.bihuniak.educator.human.*;
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

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Employee employee = new Employee("Januszek", "Art Master");
		Employee employee1 = new Employee("Graszka", "Head of Designers");
		Employee employee2 = new Employee("Halynka", "Designer");

		Department department = new Department(
			"Marketing",
			"Wroclaw",
			5,
			asList(employee, employee1, employee2));

		departmentRepository.save(department);
//		System.out.println(departmentRepository.findById(5L).get());
	}
}