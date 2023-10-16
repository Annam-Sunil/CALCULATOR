/**
 * 
 */
package com.gqt.calculatorApp.project;

import java.util.Scanner;

/**
 * @author sunilgaadu
 *
 */
public class CalculatorApplication {
	 static int  num_1;
	 static int num_2;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t welcome to the calculator");
		System.out.println("please select the operations to be performed\n"
				+"1.addition operation \n"
				+"2.substraction operation \n"
				+"3.multiplication operation \n"
				+"4.division operation \n"
				+"5.modulus operation \n"
				+"6.exit operation \n"
				+"7.restart operation \n");
		
		int choice = sc.nextInt();
		if(choice<=5) {
			System.out.println("enter the first number");
			num_1 = sc.nextInt();
			System.out.println("enter the second number");
			num_2 = sc.nextInt();
			
		}
		switch(choice) {
		case 1:{
			System.out.println("Additon operation");
			System.out.println("the result of addition is : "+ (num_1 - num_2));
			break;
		}
		case 2:{
			System.out.println(" substraction operation");
			System.out.println("the result of addition is : "+ (num_1 * num_2));
			break;
		}
		case 3:{
			System.out.println(" multiplication operation");
			System.out.println("the result of addition is : "+ (num_1 / num_2));
			break;
		}
		case 4:{
			System.out.println(" division operation");
			System.out.println("the result of addition is : "+ (num_1 % num_2));
			break;
		}
		case 5:{
			System.out.println("modulus operation");
			System.out.println("the result of addition is : "+ (num_1 + num_2));
			break;
		}
		case 6:{
			System.out.println("Thank you ...!");
			System.exit(0);
		}
		case 7:{
			main(null);
		}
		default:{
			System.out.println("this is not a valid input please try again");
			main(null);
		}
		}
		main(null);
	}

}
