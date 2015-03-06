package com.victorarana.designpatterns;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {
	
	ArrayList<MenuItem> items;
	// Position maintains the current position of the iteration
	// over the array.
	int position = 0;
	
	// The constructor takes the array of items we are going 
	// to iterate over.
	public PancakeHouseIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(position >= items.size()){
			return false; 
		} else{
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items.get(position);
		position = position + 1;
		return menuItem;
	}

}
