package lu.exercise.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import lu.exercise.library.models.Book;

public class BookRepository extends JpaRepositoryFactory<Book, Long> {
	public Book findById(long id);
}
