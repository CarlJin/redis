package com.ibm;

import java.util.Observable;
import java.util.Observer;

public class HousePriceObserver implements Observer {
	private String name;

	public HousePriceObserver(String name) {
		this.name = name;
	}

	public void update(Observable o, Object arg) {
        if(arg instanceof Float){
        	System.err.println(this.name+"观察到价格更改为："+((Float)arg).floatValue());
        }
	}

}
