package com.victorarana.designpatterns;

import java.util.ArrayList;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu(){
		ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

		for(int i = 0; i < breakfastItems.size(); i++){
			MenuItem menuItem = breakfastItems.get(i);
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
		
		MenuItem[] lunchItems = dinerMenu.getMenuItems();
		
		for(int i = 0; i < lunchItems.length && lunchItems[i+1] != null; i++){
			MenuItem menuItem = lunchItems[i];
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
			
		}
	}
}