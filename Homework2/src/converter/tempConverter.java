//HW#2  tempConverter.java
// 
//Application that converts celsius to fahrenheit & fahrenheit to celsius 
//
//celsius = 5.0 / 9.0 * (fahrenheit - 32) 
//fahrenheit = 9 / 5 * (celsius + 32)
//
//Author: Haley Sparger
//Start Date: February, 28, 2017
//End Date: Feburary, , 2017


package converter;
import java.util.Scanner;


public class tempConverter {
	
	public static void main(String[] args){
	
	// convert temperatures
	Scanner input = new Scanner( System.in );
	double convertF;
	int selection;
	double temp;
	double convertC;


	do
	{
	// print and prompt for input from user
	System.out.println("***********************************************");
	System.out.println( "Temperature Converter" );
	System.out.println("***********************************************");
	System.out.println( "Enter 1 for Fahrenheit to Celsius conversion" );
	System.out.println( "Enter 2 for Celsius to Fahrenheit conversion" );
	System.out.println( "Enter 3 to Exit\n " );
	System.out.print( "Selection: " );
	selection = input.nextInt();

	// converts celsius to fahrenheit
	// converts fahrenheit to celsius
	
	
	switch ( selection )
	{
	case 1:
	System.out.println("\n Enter fahrenheit temperature: " );
	temp = input.nextInt();
	convertF = celsius( temp );
	System.out.printf("\n %f degrees F = %f degrees C\n \n",temp,convertF );
	break;

	case 2:
	System.out.println("\n Enter celsius temperature: " );
	temp = input.nextInt();
	convertC = fahrenheit( temp );
	System.out.printf("\n%f degrees C = %f degrees F\n \n", temp, convertC );
	break;

	case 3:
		System.out.println("\nThank you for using my application!" );
		System.exit(0);
	break;

	default:
	System.out.println( "Invalid selection \n \n" );


	} // end of switch
	
	} while( selection != 3);

	}
	
	public static double fahrenheit(double celsius)
	{
	double fahrenheit;
	fahrenheit = 9 / 5 * (celsius + 32);

	return fahrenheit;
	} // end of fahrenheit 

	public static double celsius(double fahrenheit)
	{
	double celsius;
	celsius = 5 / 9 * (fahrenheit - 32);

	return celsius;
	} // end of celsius 

	
	} // end of main


