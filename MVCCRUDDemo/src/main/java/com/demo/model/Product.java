package com.demo.model;

public class Product {
	private int id;
	private String title;
	private String desc;
	private double price;
	
	public Product() {
		super();
	}

	public Product(int id, String title, String desc, double price) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", desc=" + desc + ", price=" + price + "]";
	}
	
	

}
