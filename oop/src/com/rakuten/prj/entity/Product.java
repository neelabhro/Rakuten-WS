/**
 * 
 */
package com.rakuten.prj.entity;

/**
 * @author neelabhro
 * This is a business data to represent product information
 * @version1.0
 * 
 */
public abstract class Product {
	
	private int id;
	private String name;
	private double price;
	/**
	 * 
	 */
	public Product() {
	}
	/**
	 * @param id products' id
	 * @param name name of the product
	 * @param price price of the product
	 */
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * This method is to find if the product is expensive or not.
	 * @return true if expensive
	 */

	public abstract boolean isExpensive();
}
