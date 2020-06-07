package com.bharath.restws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/productservice")
public interface ProductService {
	
	@GET
	@Path("/products")
	List<Product> getProducts();
	
	@POST
	@Path("/products")
	long addProduct(Product product);

}
