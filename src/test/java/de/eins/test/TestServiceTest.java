package de.eins.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ExpectedException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.eins.test.model.Book;
import de.eins.test.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/root-context.xml")
public class TestServiceTest {
	
	@Autowired
	TestService testService;

	@Test
	@ExpectedException(NullPointerException.class)
	public void test() {
		testService.test(null);
	}
	
	@Test
	public void test2() {
		Book book = new Book();
		assertNull(book.getTitle());
		testService.test(book);		
		assertEquals("blubb", book.getTitle());
	}

}
