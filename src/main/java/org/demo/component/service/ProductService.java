package org.demo.component.service;

import java.util.List;

import org.demo.model.Product;

public interface ProductService {

	/**
	 * @return product list
	 */
	List<Product> findAll();

}
