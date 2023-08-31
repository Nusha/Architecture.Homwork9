package org.example.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.book.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
