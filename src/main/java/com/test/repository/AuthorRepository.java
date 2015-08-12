package com.test.repository;

import com.test.entity.Author;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface AuthorRepository extends CrudRepository<Author, String> {

}
