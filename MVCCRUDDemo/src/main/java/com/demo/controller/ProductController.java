package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.MyUser;
import com.demo.model.Product;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService pservice;
	
	@GetMapping("/getproducts")
	public ModelAndView getproducts(HttpSession session) {
		MyUser u=(MyUser) session.getAttribute("user");
		if(u!=null) {
//			System.out.println(u);
			List<Product> plist=pservice.displayAllProducts();
//			plist.forEach(System.out::println);
			return new ModelAndView("displayproduct","plist",plist);
		}
		return new ModelAndView("redirect:/login/");
		
	}
	
	@GetMapping("/addproduct")
	public String displayaddform(HttpSession session) {
		MyUser u=(MyUser) session.getAttribute("user");
		if(u!=null) {
			return "addproduct";
		}else {
			return ("redirect:/login/");
		}
	}
	
	@PostMapping("/insertproduct")
	public ModelAndView insertProduct(@RequestParam int id, @RequestParam String title, @RequestParam String desc, @RequestParam double price) {
		Product p=new Product(id,title,desc,price);
		pservice.addNewProduct(p);
		return new ModelAndView("redirect:/product/getproducts");
		
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView editProduct(@PathVariable int id) {
		Product p= pservice.getById(id);
		return new ModelAndView("editproduct","p",p);
	}
	
	@PostMapping("/updateproduct")
	public ModelAndView updateProduct(@RequestParam int id, @RequestParam String title, @RequestParam String desc, @RequestParam double price) {
		pservice.updateById(new Product(id,title,desc,price));
		return new ModelAndView("redirect:/product/getproducts");
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable int id) {
		pservice.deleteById(id);
		return new ModelAndView("redirect:/product/getproducts");
	}
	

}
