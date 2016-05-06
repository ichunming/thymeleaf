package com.yimeicloud.study.thymeleaf.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yimeicloud.study.thymeleaf.model.Product;

@Controller
@RequestMapping("/")
public class HomeController {

	private Product product = new Product("产品1", 800, new java.util.Date(), "A");
	@RequestMapping("bean_values")
	public String bean_values(Model model) {
		// bean values
		model.addAttribute("product", product);
		
		return "bean_values";
	}
	
	@RequestMapping("simple_format")
	public String simple_format(Model model) {
		// simple format and string concatenation
		model.addAttribute("product", product);
		
		return "simple_format";
	}
	
	@RequestMapping("internationalization")
	public String internationalization(Model model) {
		// internationalization
		model.addAttribute("product", product);
		
		return "internationalization";
	}
	
	@RequestMapping("iteration")
	public String iteration(Model model) {
		// iteration, escaped
		List<Product> productList = new ArrayList<Product>();
		Product productT = new Product("产品2", 100, new java.util.Date(), "A");
		productList.add(product);
		productList.add(productT);
		model.addAttribute("productList", productList);
		String html = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
		model.addAttribute("html", html);
		return "iteration";
	}
	
	@RequestMapping("condition")
	public String condition(Model model) {
		// condition
		List<Product> productList = new ArrayList<Product>();
		Product productT = new Product("产品2", 100, new java.util.Date(), "B");
		productList.add(product);
		productList.add(productT);
		productT = new Product("产品3", 200, new java.util.Date(), "C");
		productList.add(productT);
		productT = new Product("产品4", 200, new java.util.Date(), "D");
		productList.add(productT);
		model.addAttribute("productList", productList);
		
		return "condition";
	}
	
	@RequestMapping("springEL")
	public String springEL(Model model) {
		// springEL
		List<Product> productList = new ArrayList<Product>();
		Product productT = new Product("产品2", 100, new java.util.Date(), "B");
		productList.add(product);
		productList.add(productT);
		model.addAttribute("productList", productList);
		return "springEL";
	}
	
	@RequestMapping("links")
	public String links(Model model) {
		// links
		return "links";
	}
	
	@RequestMapping("forms")
	public String forms(Model model) {
		// forms, inline
		
		model.addAttribute("product", product);
		
		List<String> typeList = Arrays.asList("A", "B", "C");
		model.addAttribute("typeList", typeList);
		
		return "forms";
	}
}
