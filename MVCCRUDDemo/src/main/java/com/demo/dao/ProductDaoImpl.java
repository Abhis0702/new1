package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Product> getAllProducts() {
		return jdbcTemplate.query("select * from product1", (rs,num)->{
			Product p=new Product();
			p.setId(rs.getInt(1));
			p.setTitle(rs.getString(2));
			p.setDesc(rs.getString(3));
			p.setPrice(rs.getDouble(4));
			
			return p; 
		});
		
	}

	@Override
	public void save(Product p) {
		String str="insert into product1 values(?,?,?,?)";
		jdbcTemplate.update(str,new Object[] {p.getId(),p.getTitle(),p.getDesc(),p.getPrice()});
		
	}

	@Override
	public Product findById(int id) {
		try {
		return jdbcTemplate.queryForObject("select * from product1 where id=?",new Object[] {id},BeanPropertyRowMapper.newInstance(Product.class));
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public void updateProdById(Product product) {
		jdbcTemplate.update("update product1 set title=?, description=?,price=? where id=?", new Object[] {product.getTitle(), product.getDesc(),product.getPrice(),product.getId()});
				
	}

	@Override
	public void deleteById(int id) {
		jdbcTemplate.update("delete from product1 where id=?" , new Object[] {id});
		
	}

}
