package org.demo.component.controller;

import java.util.List;

import org.demo.component.service.ProductService;
import org.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@RequestMapping(value = "/getProduct")
	List<Product> getProduct()
	{
		return productService.findAll();
	}
	
	
}
