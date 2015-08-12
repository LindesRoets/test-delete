
package com.test.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.hibernate.envers.Audited;

@Entity
@Audited
public class Author extends BaseEntity{
	
	private String email;
	
	private String name;
	
	@OneToMany(mappedBy = "author")
	private List<Book> books = new ArrayList<>();
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}


}
