package org.generation.italy;

public class Calculator {

	float num1;
	float num2;
	
	
	
	public Calculator(float num1, float num2) {
		super();
		setNum1(num1);
		setNum2(num2);
	}
	public float getNum1() {
		return num1;
	}
	public void setNum1(float num1) {
		this.num1 = num1;
	}
	public float getNum2() {
		return num2;
	}
	public void setNum2(float num2) {
		this.num2 = num2;
	}
	
	public float add() {
		return getNum1()+getNum2();
	}
	
	public float subtract() {
		return getNum1()-getNum2();
	}
	
	public float divide() {
		return getNum1()/getNum2();
	}
	
	public float multiply() {
		return getNum1()*getNum2();
	}
	
	

}
