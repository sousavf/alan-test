**Exercise Description:** Create a simple RESTful API that allows users to manage a list of books. Each book should have a title, author, and ISBN. The API should allow users to perform the following operations:
1.	Create a new book
2.	Retrieve a specific book by ID
3.	Update an existing book
4.	Delete an existing book
5.	Retrieve a list of all books

**Technical Requirements:**
1. Use Spring Boot version 2.x
2. Use Spring Data JPA for persistence
3. Use H2 in-memory database for data storage
4. Use Maven for dependency management
5. Use JUnit for unit testing


**You should aim to complete as much of the exercise as possible within the 20-minute timeframe. Good luck!
Here are some steps to help you get started:**
1.	Create a Book entity class with the following fields: id, title, author, and isbn. Add appropriate getters and setters.
2.	Create a BookRepository interface that extends the JpaRepository interface. This interface will handle CRUD operations for the Book entity.
3.	Create a BookService class that implements the following methods:
      •	createBook(Book book): creates a new book and saves it to the database
      •	getBookById(Long id): retrieves a book by its ID
      •	updateBook(Book book): updates an existing book
      •	deleteBook(Long id): deletes a book by its ID
      •	getAllBooks(): retrieves a list of all books
5.	Create a BookController class with the following RESTful endpoints:
      •	POST /books: creates a new book
      •	GET /books/{id}: retrieves a specific book by ID
      •	PUT /books/{id}: updates an existing book
      •	DELETE /books/{id}: deletes an existing book
      •	GET /books: retrieves a list of all books
6.	Write unit tests for the BookService class using JUnit.
7.	Run the application and test the endpoints using a tool like Postman or curl.
