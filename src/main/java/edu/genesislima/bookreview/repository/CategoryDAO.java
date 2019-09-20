package edu.genesislima.bookreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.genesislima.bookreview.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer> {

	
	 //TODO Refactor to implementation in order to assure and limit the result
	 @Query("SELECT c FROM Category c WHERE c.name = ?1")
	 Category  findCategoryByName(String name);
}
