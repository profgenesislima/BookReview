package edu.genesislima.bookreview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.genesislima.bookreview.entity.Category;
import edu.genesislima.bookreview.repository.CategoryDAO;

@Controller
@RequestMapping(value="category")
public class CategoryController {

	@Autowired
	private CategoryDAO dao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String category() {
		return "category/index";
	}

	
	@RequestMapping("/save")
	public String register(Category category) {
		dao.save(category);
		return "redirect:/category";
	}

	
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
