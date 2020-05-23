package com.bihuniak.educator;

import com.bihuniak.educator.animal.*;
import com.bihuniak.educator.file.DbFile;
import com.bihuniak.educator.file.DbFileRepository;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootTest
class EducatorApplicationTests {

	@Autowired
	private DbFileRepository dbFileRepository;


	@Test
	void contextLoads() throws IOException {
		InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("download.jpg");
		byte[] bytes = IOUtils.toByteArray(resourceAsStream);
		DbFile dbFile = new DbFile(bytes);
		dbFileRepository.save(dbFile);
	}

	@Test
	void contextLoads2() throws IOException {
		DbFile dbFile = dbFileRepository.findById(5L).get();
		Files.write(Paths.get("abcd2.jpg"), dbFile.getContent());
	}

}
