package com.coderscampus;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	Object[] items20; 
	Object[] items40;
	int size=10;
	int i =0;

	@Override
	public boolean add(T item) {
		if (i  < 10) {
			this.items[i] = item;
			i++;
		}else if(i==10) {
			copyItems(i);
			size = items20.length;
			this.items20[i]=item;
			i++;
		}else if(i >10 && i <20 ) {
			this.items20[i]=item;
			i++;
		}else if(i==20) {
			copyItems(i);
			size = items40.length;
			this.items40[i]=item;
			i++;	
		}else if(i>20 && i <40) {
			this.items40[i]=item;
			i++;
		}
		return true;
	 }

	private void copyItems(int size) {
		if (size==10) {
			items20 =new Object[this.items.length*2];
			for(int i=0;i<size;i++) {
				items20[i] =this.items[i];
			}
		}else if (size==20) {
			items40 =new Object[this.items20.length*2];
			for(int i=0;i<size;i++) {
				items40[i] =this.items20[i];
			}
		}
	}

	@Override
	public int getSize() {
		
		return size;
	}

	@Override
	public T get(int index) {
		
		if(size<10) {
			return (T) this.items[index];
		}else if( size >10 && size<=20) {
			return (T) this.items20[index];
		}else if(size > 20 && size<=40) {
			return (T) this.items40[index];
		}else {
			return (T) this.items[index];
		}
		
	}


}
