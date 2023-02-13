package com.coderscampus;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	int currSize =0;
	int maxSize = 10;
	Object[] itemsArray = new Object[10];

	@Override
	public boolean add(T item) {
		if (currSize < maxSize) {
			this.itemsArray[currSize] = item;
			currSize++;
			return true;
		} else if (currSize == maxSize) {
				maxSize = maxSize *2;
				itemsArray = Arrays.copyOf(itemsArray, maxSize);
				itemsArray[currSize] = item;
				currSize++;
				return true;
		}
		return false;
	}
	@Override
	public int getSize() {
		
		return maxSize;
	}
	@Override
	public T get(int index) {
			return (T) this.itemsArray[index];	
	}
}
