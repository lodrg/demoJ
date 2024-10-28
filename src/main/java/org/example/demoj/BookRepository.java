package org.example.demoj;

import org.example.demoj.Book;
import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JRepository<Book, Long> {
}