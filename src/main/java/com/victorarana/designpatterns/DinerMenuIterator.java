package com.victorarana.designpatterns;

public class DinerMenuIterator implements Iterator {

	MenuItem[] items;
	// Position maintains the current position of the iteration
	// over the array.
	int position = 0;
	
	// The constructor takes the array of items we are going 
	// to iterate over.
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	// The hasNext() method checks to see if we've seen all the elements of 
	// the array and returns true if there area more to iterate through
	@Override	
	public boolean hasNext() {
		if(position >= items.length || items[position] == null){
			return false;
		} else{
			return true;
		}
		
	}
	
	// The next() method returns the next item in the array and increments the position
	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
	
	public void remove(){
		if(position <= 0){
			throw new IllegalStateException("You can't remove an item until you've done at least one next()");
		}
		if(items[position - 1] != null){
			for(int i = position - 1; i < (items.length - 1); i++){
				items[i] = items[i+1];
			}
			items[items.length - 1] = null;
		}
	}
}
