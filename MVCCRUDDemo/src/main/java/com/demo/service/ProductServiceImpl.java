package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao edao;

	@Override
	public List<Product> displayAllProducts() {
		return edao.getAllProducts();
	}

	@Override
	public void addNewProduct(Product p) {
		edao.save(p);
		
	}

	@Override
	public Product getById(int id) {
		return edao.findById(id);
	}

	@Override
	public void updateById(Product product) {
		edao.updateProdById(product);		
	}

	@Override
	public void deleteById(int id) {
		edao.deleteById(id);
		
	}

}
