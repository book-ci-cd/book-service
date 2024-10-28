package com.demo.book_service.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.book_service.model.Book;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {

    List<Book> findByBookAuthurId(String bookAuthurId);
}
