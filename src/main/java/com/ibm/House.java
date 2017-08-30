package com.ibm;

import java.util.Observable;

public class House extends Observable{
	private float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		super.setChanged();
		super.notifyObservers(price);
		this.price = price;
	}
	@Override
	public String toString() {
		return "房子的价格为："+this.price;
	}
	
	public static void main(String[] args) {
		
	}
}
