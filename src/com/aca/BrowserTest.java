package com.aca;

public class BrowserTest {
	
	 enum BrowserType { IE("Microsoft",3.4), Chrome("Google",1.0), Firefox();
		
		private String owner;

		private BrowserType(String owner, double version) {
			this.owner = owner;
		}
		
		private BrowserType() {
			owner = "don't care";
		}

		public String getOwner() {
			return owner;
		}
	}


	public static void main(String[] args) {
		BrowserTest bt = new BrowserTest();
//		bt.demo();
		
		bt.displayEnum(BrowserType.Firefox);
	}

	private void demo() {
	
		for (BrowserType t : BrowserType.values()) {
			System.out.println("t: " + t);
		}
		
		for (BrowserType t : BrowserType.values()) {
			System.out.println(t + " is owned by: " + t.getOwner());
		}		
		
	}
	
	private void displayEnum(BrowserType bt) {
		
		switch(bt) {
		case IE:
			System.out.println("This one stinks!");
			break;
		case Chrome:
			System.out.println("Winner winner, chicken dinner!");
			break;
		case Firefox:
			System.out.println("Can't help you");
			break;
		}
	}

}
