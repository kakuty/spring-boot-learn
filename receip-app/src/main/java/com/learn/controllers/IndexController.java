package com.learn.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learn.domain.Category;
import com.learn.domain.UnitOfMeasure;
import com.learn.repositories.CategoryRepository;
import com.learn.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {
	
	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	
	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		super();
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}


	@RequestMapping({"", "/", "/index"})
	public String getIndexPage() {
		Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Cafe");
		
		System.out.println("Cat id is: " + categoryOptional.get().getId());
		System.out.println("UOM id is: " + unitOfMeasureOptional.get().getId());
		return "index";
	}
}
