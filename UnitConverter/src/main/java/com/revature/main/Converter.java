package com.revature.main;

import java.util.Scanner;

public class Converter {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int menuSelection = 0;
		 
		while (menuSelection != 4) { // put into its own variable and call throughout code
			System.out.println("Please select an option: ");
			System.out.println("1. Volume Conversions");
			System.out.println("2. Distance Conversions");
			System.out.println("3. Weight Conversions");
			System.out.println("4. Quit");
			
			menuSelection = scanner.nextInt();
			
			System.out.println("You have entered: " + menuSelection);
			
			switch (menuSelection) {
			
				case 1: {
					volumeConversions(scanner);
					break;
				}
				
				case 2: {
					distanceConversions(scanner);
					break;
				}
	
				case 3: {
					weightConversions(scanner);
					break;
				}
				
				case 4: {
					System.out.println("Goodbye!");
					break;
				}
			}
		}
		
		scanner.close();

	}
	
	public static void volumeConversions(Scanner s) {
		System.out.println("Please select an option: ");
		System.out.println("1. Teaspoons to Tablespoons");
		System.out.println("2. Teaspoons to Cups");
		System.out.println("3. Quit");
		
		int menuSelection = s.nextInt();
		
		double unit1 = 0;
		double unit2 = 0;
		String value1 = null;
		String value2 = null;
		
		switch (menuSelection) {
		
			case 1: {
				value1 = "Teaspoons";
				value2 = "Tablespoons";
				unit1 = userInput(value1, value2, s);
				unit2 = convertTspToTbsp(unit1);
				break;
			}
			
			case 2: {
				value1 = "Teaspoons";
				value2 = "Cups";
				unit1 = userInput(value1, value2, s);
				unit2 = convertTspToCups(unit1);
				break;
			}
			
			case 3: {
				s.close(); // change to go back to main menu
			}
		}
		
		if (menuSelection != 3) {
			System.out.println(unit1 + " " + value1 + " equals " + unit2 + " " + value2);
		} else {
			System.out.println("Goodbye!");
		}
		
	}
	
	public static double userInput(String value1, String value2, Scanner s) {
		System.out.println("Please enter the first value: ");
		Double value = s.nextDouble();
		return value;
		
		
	}
	
	public static void distanceConversions(Scanner s) {
		System.out.println("Please select an option: ");
		System.out.println(" 1. Feet to Meters");
		System.out.println(" 2. Miles to Kilometers");
		System.out.println(" 3. Inches to Feet");
		System.out.println(" 4. Quit");
		
		int menuSelection = s.nextInt();
		
		double unit1 = 0;
		double unit2 = 0;
		String value1 = null;
		String value2 = null;
		
		switch (menuSelection) {
			
			case 1: {
				value1 = "Feet";
				value2 = "Meters";
				unit1 = userInput(value1, value2, s);
				unit2 = convertFeetToMeters(unit1);
				break;
			}
			
			case 2: {
				value1 = "Miles";
				value2 = "Kilometers";
				unit1 = userInput(value1, value2, s);
				unit2 = convertMilesToKilometers(unit1);
				break;
			}
			
			case 3: {
				value1 = "Inches";
				value2 = "Feet";
				unit1 = userInput(value1, value2, s);
				unit2 = convertInchesToFeet(unit1);
				break;
			}
			
			case 4: {
				s.close();
			}
		}
		
		if (menuSelection != 4) {
			System.out.println(unit1 + " " + value1 + " equals " + unit2 + " " + value2);
		} else {
			System.out.println("Goodbye!");
		}
		
	}
	
	public static void weightConversions(Scanner s) {
		System.out.println("Please select an option: ");
		System.out.println(" 1. Pounds to Kilograms");
		System.out.println(" 2. Kilogram to Metric ton");
		System.out.println(" 3. Ounce to Pound ");
		System.out.println(" 4. Quit ");
		
		int menuSelection = 0;
		
		String value1 = null;
		String value2 = null;
		double unit1 = 0;
		double unit2 = 0;
		
		switch (menuSelection) {
		
			case 1: {
				value1 = "Pounds";
				value2 = "Kilograms";
				unit1 = userInput(value1, value2, s);
				unit2 = convertPoundsToKilograms(unit1);
				break;
			}
			
			case 2: {
				value1 = "Kilogram";
				value2 = "Metric ton";
				unit1 = userInput(value1, value2, s);
				unit2 = convertKilogramToMetricTon(unit1);
				break;
			}
			
			case 3: {
				value1 = "Ounce";
				value2 = "Pound";
				unit1 = userInput(value1, value2, s);
				unit2 = convertOunceToPound(unit1);
				break;
			}
			
			case 4: {
				s.close(); 
			}
		}
	}
	
	public static double convertTspToTbsp(Double value) { // change to one method with a switch statement???? 
		return value / 3;
	}
	
	public static double convertTspToCups(Double value) {
		return value / 48.692;
	}
	
	public static double convertFeetToMeters(Double value) {
		return value / 3.281;
	}
	
	public static double convertMilesToKilometers(Double value) {
		return value * 1.609;
	}
	
	public static double convertInchesToFeet(Double value) {
		return value / 12;
	}
	
	public static double convertPoundsToKilograms(Double value) {
		return value / 2.205;
	}
	
	public static double convertKilogramToMetricTon(Double value) {
		return value / 1000;
	}
	
	public static double convertOunceToPound(Double value) {
		return value / 16;
	}
	

}
