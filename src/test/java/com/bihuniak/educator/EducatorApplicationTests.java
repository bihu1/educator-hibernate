package com.bihuniak.educator;

import com.bihuniak.educator.animal.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EducatorApplicationTests {

	@Autowired
	private CatRepository catRepository;

	@Autowired
	private PandaRepository pandaRepository;

	@Test
	void contextLoads() {
//		Cat cat = new Cat("kotowate", "mruczek", true);
//		catRepository.save(cat);
//		Panda panda = new Panda("niedzwiedziowate", "Gumis", false);
//		pandaRepository.save(panda);
		System.out.println(catRepository.findById(5L).get().getName());
		System.out.println(pandaRepository.findById(6L).get().getName());
	}

}
