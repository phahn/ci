package de.eins.test.service;

import org.springframework.stereotype.Service;

import de.eins.test.model.Book;

@Service
public class TestService {

	public void test(Book book) {
		
		if (book == null) {
			throw new NullPointerException();
		}
		
		book.setTitle("blubb");		
	}
	
}
