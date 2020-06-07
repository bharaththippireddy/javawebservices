package com.bharath.ws.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharath.ws.soap.entities.Product;
import com.bharath.ws.soap.repos.ProductRepository;

@Service
public class ProductWsImpl implements ProductWs {
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public List<Product> getProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product getProduct(int id) {
		return productRepo.findById(id).get();
	}

	@Override
	public Product createProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepo.save(product);
	}

}
