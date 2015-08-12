package com.dcp.test;

import com.test.Application;
import com.test.entity.Author;
import com.test.repository.AuthorRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class AuthorRepositoryTest {

	@Autowired
	private AuthorRepository authorRepo;

	@Test
	public void testAuthorCRUD() {
		Author author = new Author();
		author.setName("Test Name");
		author.setEmail("test@mail.com");

		Author savedAuthor = authorRepo.save(author);

		Assert.assertNotNull(savedAuthor);

		authorRepo.delete(savedAuthor);
	}

}
