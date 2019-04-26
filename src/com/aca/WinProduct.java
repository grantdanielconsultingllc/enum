package com.aca;

public enum WinProduct { DISH(1), HSI(2), DirectTv(3);

	private int itemNumber;

	private WinProduct(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public int getItemNumber() {
		return itemNumber;
	}
	
//	public static WinProduct valueOf(String value) {
//		
//		
//		return null;
//	}
	
	
}
