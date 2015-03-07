package com.victorarana.designpatterns;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
	
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu(){
		menuItems = new ArrayList<MenuItem>();
		
		this.addItem("KB Pancake Breakfast", 
					 "Pancakes with scrambled eggs, and toast", 
					 true, 
					 2.99);
		this.addItem("Regular Pancake Breakfast", 
					 "Pancakes with fried eggs, sausage", 
					 false, 
					 2.99);
		this.addItem("Blueberry Pancakes", 
				 	 "Pancakes made with fresh blueberries",
				 	 true, 
				 	 3.49);
		this.addItem("Waffles", 
			 	 	 "Waffles, with your choice of blueberries",
			 	 	 true, 
			 	 	 3.59);
	}

	public void addItem(String name, 
						String description,
						boolean vegetarian,
						double price) {
		
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		
		menuItems.add(menuItem);
	}
	
	public Iterator<MenuItem> createIterator(){
		return menuItems.iterator();
	}
	// other menu methods here
}
