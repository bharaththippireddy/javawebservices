package com.bharath.ws.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.bharath.ws.soap.entities.Product;

@WebService
public interface ProductWs {

	@WebMethod
	List<Product> getProducts();

	@WebMethod
	Product getProduct(int id);

	@WebMethod
	Product createProduct(Product product);

	@WebMethod
	Product updateProduct(Product product);

}
