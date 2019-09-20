package edu.genesislima.bookreview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.genesislima.bookreview.entity.Book;
import edu.genesislima.bookreview.repository.BookDAO;
import edu.genesislima.bookreview.repository.CategoryDAO;

@Controller
@RequestMapping("book")
public class BookController {

	@Autowired
	BookDAO bookDAO;

	@Autowired 
	CategoryDAO categoryDAO;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String register(Book book, @RequestParam("categoryName") String categoryName) {
		book.setCategory(categoryDAO.findCategoryByName(categoryName));
		bookDAO.save(book);	
		return "redirect:/";
	}
	
}
