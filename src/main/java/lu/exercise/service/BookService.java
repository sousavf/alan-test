package lu.exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.exercise.library.models.Book;
import lu.exercise.repository.BookRepository;

@RestController
public class BookService  {
	
	@Autowired
	BookRepository bookRepository;
	
	@GetMapping("/book")
	public List<Book> listBook() {
		return bookRepository.
	}

}
