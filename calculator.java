package calculator;

import java.util.Scanner;

class operation {
	private int val1, val2;
	
	operation(int num1, int num2){
		this.val1 = num1;
		this.val2 = num2;
	}
	void add() {
		int addition =  val1 + val2;
		System.out.println("the addition result is: " + addition);
	}
	void sub() {
		int Subtraction = val1 - val2;
		System.out.println("the Subtraction result is: " + Subtraction);
	}
	void mul() {
		int m = val1 * val2;
		System.out.println("the multiplication result is: " + m);
	}
	void div() {
		float d = (float) val1 / val2;
		System.out.println("the division result is: " + d);
	}
}
public class calculator {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc = new Scanner(System.in);
		
		// input value one
		System.out.println("enter the num 1");
		int num1 = sc.nextInt();
		
		// input value 2
		System.out.println("enter the num 2");
		int num2 = sc.nextInt();
		
		// choose operation apply on 2 values
		System.out.println("enter operator \n"
				+ "1. Addition\n"
				+ "2. Subtraction\n"
				+ "3. multiplication\n"
				+ "4. division\n");
		int n = sc.nextInt();
		
		// declare operation class object
		operation op = new operation(num1, num2);
		
		if(n==1) {// call addition method
			op.add();
		}
		if(n==2) { // call subtraction method
			op.sub();
		}
		if(n==3) { // call multiplication method
			op.mul();
		}
		if(n==4) { // call division method
			op.div();
		}
		else { // exit program
			System.exit(0);
		}
	}
}
