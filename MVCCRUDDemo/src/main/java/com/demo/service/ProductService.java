package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	List<Product> displayAllProducts();

	void addNewProduct(Product p);

	Product getById(int id);

	void updateById(Product product);

	void deleteById(int id);

}
