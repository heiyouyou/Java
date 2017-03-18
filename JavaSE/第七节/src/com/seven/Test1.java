package com.seven;

public class Test1 {
	public static void main(String[] args){
		Computer computer = new Computer();
		System.out.println("修改前：");
		computer.showMessage();
		computer.setBrand("Dell");
		computer.setMadeIn("美国");
		computer.setPrice(8000.00);
		computer.setType("inter i5");
		System.out.println("修改后：");
		computer.showMessage();
	}
}
