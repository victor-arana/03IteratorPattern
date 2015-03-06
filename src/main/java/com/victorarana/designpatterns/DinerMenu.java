package com.victorarana.designpatterns;

public class DinerMenu {
	
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu(){
		menuItems = new MenuItem[MAX_ITEMS];
		
		this.addItem("Vegetarian BLT",
					 "(Fakin') Bacon with lettuce & tomato on whole wheat",
				 	  true, 
				 	  2.99);
		this.addItem("BLT",
				 	 "Bacon with lettuce & tomato on whole wheat",
				 	 true, 
				 	 2.99);
		this.addItem("Soup of the day",
			 	 	 "Soup of the day, with a side of potato salad",
			 	 	 false, 
			 	 	 3.29);
		this.addItem("Hotdog",
		 	 	 	 "A hot dog, with saurkraut, relish, onions",
		 	 	 	  false, 
		 	 	 	  3.05);
	}

	private void addItem(String name,
						 String description, 
						 boolean vegetarian, 
						 double price) {
		
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		
		if(numberOfItems >= MAX_ITEMS){
			System.err.println("Sorry, menu is full! Can't add item to menu");
		} else{
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
		
	}
	
	public Iterator createIterator(){
		return new DinerMenuIterator(menuItems);
	}
	// other menu methods here.
}
