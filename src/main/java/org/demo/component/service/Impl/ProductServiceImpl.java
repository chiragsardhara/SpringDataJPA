package org.demo.component.service.Impl;

import java.util.List;

import org.demo.component.repository.ProductRepository;
import org.demo.component.service.ProductService;
import org.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author CSardhara
 *
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	/* (non-Javadoc)
	 * @see org.demo.component.service.ProductService#findAll()
	 */
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	
	
	
	
}
