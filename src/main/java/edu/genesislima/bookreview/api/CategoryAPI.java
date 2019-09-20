package edu.genesislima.bookreview.api;

import java.util.List;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.genesislima.bookreview.entity.Category;
import edu.genesislima.bookreview.repository.CategoryDAO;

@RestController
public class CategoryAPI {

	@Autowired
	CategoryDAO dao;
	
	
	@GetMapping("/api/v1/categories")
	@Produces("application/json")
	public @ResponseBody List<Category> getAllCategories() {		  
          
		//List<Category> categories = dao.findAll();
		
		//modelAndView.addObject("categories", categories);
		//modelAndView.setViewName("/list");
		
		return dao.findAll();
	}
}
