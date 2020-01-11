/**
 * 
 */
package com.rakuten.prj.entity;

/**
 * @author neelabhro
 *
 */
public class TV extends Product {
	private String screenType;

	/**
	 * @param screenType
	 */
	public TV(String screenType) {
		
	}

	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param screenType
	 */
	public TV(int id, String name, double price, String screenType) {
		super(id, name, price);
		this.screenType = screenType;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	@Override
	public boolean isExpensive() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
