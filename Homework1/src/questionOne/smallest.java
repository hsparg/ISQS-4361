//HW#1 Question 1 - Smallest.java
//Find the smallest integer
//
//Write an application that finds the smallest of several integers.
//Assume that the first value read specifies the number of values
//to input from the user.
//
//Author: Haley Sparger
//February,19, 2017 

package questionOne;

import java.util.Scanner;

public class smallest { 
		
public static void main(String[] args){

		Scanner input = new Scanner(System.in);//create object to obtain input
	
		          int counter;
		          int smallest = 0;//stores smallest integer
		          int number = 0;
		          int integers = 0;
		
	 System.out.print("Enter number of integers: ");
	 integers = input.nextInt();

	 for(counter = 1;counter<=integers;counter++){
		 
       System.out.print("Please enter an integer: ");
	   number = input.nextInt();

             if(counter == 1)
                 smallest = number;
             else
             if(number < smallest)
            	 smallest = number;
	}//end for
		 
	System.out.printf("The smallest integer is: %d\n", smallest);
	
} //end main

} //end smallest class




