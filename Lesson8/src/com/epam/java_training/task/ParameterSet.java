package com.epam.java_training.task;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ParameterSet<T> {
	private T[] set;
	private int count_elements;
	
	public ParameterSet(){
		count_elements = 0;
		
	}
	
	@SuppressWarnings("unchecked")
	public boolean addElement(T element){
		
		if (this.existElement(element) == true){
			
			System.out.println("The record already exists with such fields and cannot be added.");
			System.out.println("element = " + element);
			return false;
			
		}
		int new_set_size = this.count_elements + 1;
		
		T[] new_set = (T[]) Array.newInstance(element.getClass() , new_set_size);
		
		if (this.count_elements == 0){
			new_set[0] = element;
		}
		else{
			new_set = Arrays.copyOf(this.set, new_set_size);
			
			new_set[this.count_elements] = element;
		}
		
		this.count_elements = this.count_elements + 1;
		
		this.set = new_set;
		
		return true;
	}
	
	public boolean removeElement(int index){
		int i_new = 0;
		int new_set_size = 0;
		
		if (index < 1){
			System.out.println("The position should be more then 1.");
			return false;
		}
		else if (this.count_elements == 0){
			
			System.out.println("The set is empty.");
			return false;
		}
		else if (this.count_elements < index){
			System.out.println("There are not elements with such position " + index);
			return false;
		}
		
		if (this.count_elements == 1){
			
			System.out.println(set[0]);
			
			this.count_elements = 0;
			this.set = null;
			
			System.out.println("The element is deleted. Currently no elements.");
			
			return true;
		}
		
		new_set_size = this.count_elements - 1;
		T[] new_set = Arrays.copyOf(this.set, new_set_size);

		
		for (int i = 0; i < this.count_elements; i++){
			if ( i != index - 1){
				new_set[i_new] = this.set[i];
				i_new++;
			}
		}
		
		this.count_elements = this.count_elements - 1;
		this.set = new_set;
		
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public boolean removeElement(T element){
		
		int i_new = 0;
		
		if (this.existElement(element) == false){
			
			System.out.println("The record does not exist with such fields and cannot be removed.");
			System.out.println("element = " + element);
			return false;
			
		}
		else if (isEmpty() == true){
			
			System.out.println("The set is empty.");
			return false;
		}
		
		T[] new_set = (T[]) Array.newInstance(element.getClass() , this.count_elements - 1);
		
		
		for (int i = 0; i < this.count_elements; i++){
			if (!this.set[i].equals(element) ){
				new_set[i_new] = this.set[i];
				i_new++;
			}
		}
			
		this.count_elements = this.count_elements - 1;
		
		this.set = Arrays.copyOf(new_set, this.count_elements);
		
		return true;
	}
	
	
	public boolean existElement(T current_element){
		
		if (isEmpty() == true){
			return false;
		}
		
		
		for (int i = 0; i < this.count_elements; i++){
			if (this.set[i].equals(current_element)){
				return true;
			}
		}
		
		return false;
	}
	
	public boolean isEmpty() {		
		if (this.count_elements == 0){
			return true;
		}
		else{
			return false;
		}		
	}
	
	public boolean contains(T object) {
		
		for (T element : this.set){
			if (element.equals(object)){
				return true;
			}
		}
		return false;
	}
	
	public int size(){ 
		return this.count_elements;
	}
	
	@Override
	public String toString() {
		return "Elements =" + Arrays.toString(set);
	}
	
	public T[] toArray() {
		
		T[] result_set;
		
		result_set = Arrays.copyOf(this.set, this.count_elements);
		
		return result_set;
	}
	
	
}
