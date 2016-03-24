package com.ibm;

public class ObserDemo01 {
    public static void main(String[] args) {
		House h = new House();
		HousePriceObserver hpo1 = new HousePriceObserver("A");
		HousePriceObserver hpo2 = new HousePriceObserver("B");
		HousePriceObserver hpo3 = new HousePriceObserver("C");
		
		h.addObserver(hpo3);
		h.addObserver(hpo2);
		h.addObserver(hpo1);
		
		System.err.println(h);
		h.setPrice(666666);
		System.err.println(h);
	}
}
