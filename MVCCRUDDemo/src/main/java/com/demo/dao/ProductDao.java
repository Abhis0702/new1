package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {

	List<Product> getAllProducts();

	void save(Product p);

	Product findById(int id);

	void updateProdById(Product product);

	void deleteById(int id);

}
