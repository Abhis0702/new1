package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.MyUser;

@Repository
public class LoginDaoImpl implements LoginDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public MyUser checkUser(String unm, String passwd) {
		try {
			String str="select username, password from myuser1 where username=? and password=?";
			return jdbcTemplate.queryForObject(str, new Object[] {unm,passwd}, BeanPropertyRowMapper.newInstance(MyUser.class));
		}catch(EmptyResultDataAccessException e) {
			System.out.println("Not Found"+e.getMessage());
			return null;
		}
		
				
	}

}
