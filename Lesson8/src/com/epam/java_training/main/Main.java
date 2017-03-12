/*
 * Задача 8.
 * Date: 12.03.2017
   Author: Anastasiya Findziukevich
   
Реализуйте самостоятельно динамическую структуру Множество, не содержащую дублирующихся элементов. 
Используйте параметризацию при описании класса. 
(Условие не означает необходимости повторить все возможности класса HashSet).
 * 
 * 
 */

package com.epam.java_training.main;

import com.epam.java_training.task.ParameterSet;

public class Main {
	
	public static void testInteger(){
		ParameterSet<Integer> set_1 = new ParameterSet<Integer>();
		
		Integer element;
		
		System.out.println("Заполним элементами: 2, 28, 35, 29, 198, 209: ");
		set_1.addElement(2);
		set_1.addElement(28);
		set_1.addElement(35);
		set_1.addElement(29);
		set_1.addElement(198);
		set_1.addElement(209);
		
		System.out.println(set_1);
		
		System.out.println();
		System.out.println("Удалим элемент 8 по счету");
		set_1.removeElement(8);
	
		System.out.println("Удалим элемент 2 по счету");
		set_1.removeElement(2);
		
		System.out.println();
		System.out.println(set_1);
		
		System.out.println();
		System.out.println("Добавим существующий элемент = 35");
		set_1.addElement(35);
		
		
		element = 156;
		System.out.println("Удалим элемент равный 156");
		set_1.removeElement(element);
		
		
		element = 198;
		System.out.println("Удалим элемент равный 198");
		set_1.removeElement(element);
		
		System.out.println();
		System.out.println(set_1);
		
		element = 209;
		System.out.print("Проверим существующий элемент 209: ");
		
		if (set_1.contains(element) == true){
			System.out.println("Существует объект.");
		}
		else{
			System.out.println("Объект не существует.");
		};
		
		element = 219;
		System.out.print("Проверим существующий элемент 219: ");
		
		if (set_1.contains(element) == true){
			System.out.println("Существует объект.");
		}
		else{
			System.out.println("Объект не существует.");
		};
		
		System.out.println("Скопировать массив в Integer: ");
		Integer[] set_int = set_1.toArray();
		
		for (Integer element_int : set_int){
			System.out.println("element = " + element_int);
		}
		
		System.out.println();
	}
	
	public static void testString(){
		ParameterSet<String> set_2 = new ParameterSet<String>();
		
		String element;
		
		System.out.println("Заполним строковыми элементами: str2, str28, str35, str29, str198, str209: ");
		set_2.addElement("str2");
		set_2.addElement("str28");
		set_2.addElement("str35");
		set_2.addElement("str29");
		set_2.addElement("str198");
		set_2.addElement("str209");
		
		System.out.println(set_2);
		
		System.out.println();
		System.out.println("Удалим элемент 8 по счету");
		set_2.removeElement(8);
	
		System.out.println("Удалим элемент 2 по счету");
		set_2.removeElement(2);
		
		System.out.println();
		System.out.println(set_2);
		
		System.out.println();
		System.out.println("Добавим существующий элемент = str35");
		set_2.addElement("str35");
		
		
		element = "str156";
		System.out.println("Удалим элемент равный str156");
		set_2.removeElement(element);
		
		
		element = "str198";
		System.out.println("Удалим элемент равный str198");
		set_2.removeElement(element);
		
		System.out.println();
		System.out.println(set_2);
		
		element = "str209";
		System.out.print("Проверим существующий элемент str209: ");
		
		if (set_2.contains(element) == true){
			System.out.println("Существует объект.");
		}
		else{
			System.out.println("Объект не существует.");
		};
		
		element = "str219";
		System.out.print("Проверим существующий элемент str219: ");
		
		if (set_2.contains(element) == true){
			System.out.println("Существует объект.");
		}
		else{
			System.out.println("Объект не существует.");
		};
		
		System.out.println("Скопировать массив в String: ");
		String[] set_string = set_2.toArray();
		
		for (String element_string : set_string){
			System.out.println("element = " + element_string);
		}
		
		System.out.println();
	}
	
	public static void main(String[] args){
		
		
		System.out.println("Создадим пример с Integer");
		testInteger();
		
		System.out.println("Создадим пример со String");
		testString();
	    
	}
	
	

}
