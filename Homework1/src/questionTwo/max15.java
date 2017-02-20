//HW#1 Question 1 - oddNumbers.java
//Find the smallest integer
//
//Write an application that uses a loop to calculate the product of odd integers from 1 to 15. 
//
//Author: Haley Sparger
//February,19, 2017

package questionTwo;

import java.util.Scanner;

public class max15 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//create object to obtain input
		
        int counter;
        int product = 1;//stores the product of odd integers
       	 
        for (counter = 1; counter <= 15; counter+=2) {
         	product*= counter;
	
      } //end for

        System.out.printf("The product of odd intergers is: %d\n", product);   
        
	}// end main
	
}// end oddNumber Class

