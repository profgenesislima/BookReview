package edu.genesislima.bookreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.genesislima.bookreview.entity.Book;

public interface BookDAO extends JpaRepository<Book, Integer>{

}
