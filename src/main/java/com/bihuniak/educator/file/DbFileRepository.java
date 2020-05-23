package com.bihuniak.educator.file;

import com.bihuniak.educator.animal.CatRepository;
import org.springframework.data.repository.CrudRepository;

public interface DbFileRepository extends CrudRepository<DbFile, Long> {
}