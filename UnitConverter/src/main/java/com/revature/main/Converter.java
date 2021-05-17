package com.revature.main;

import java.util.Scanner;

public class Converter {
	
	public static double unit1 = 0;
	public static double unit2 = 0;
	public static String value1 = "";
	public static String value2 = "";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int menuSelection = 0;
		 
		while (menuSelection != 4) {
			
			printMainMenu();
			
			menuSelection = scanner.nextInt();
			
			System.out.println("You have entered: " + menuSelection);
			
			switch (menuSelection) {
			
				case 1: {
					volumeConversions(scanner);
					int volumeSelection = scanner.nextInt();
					switch (volumeSelection) {
					
						case 1: {
							value1 = "Teaspoons";
							value2 = "Tablespoons";
							unit1 = userInput(value1, value2, scanner);
							unit2 = conversionCalculator(unit1, value1, value2);
							printConversionStatement();
							break;
						}
						
						case 2: {
							value1 = "Teaspoons";
							value2 = "Cups";
							unit1 = userInput(value1, value2, scanner);
							unit2 = conversionCalculator(unit1, value1, value2);
							printConversionStatement();
							break;
						}
						
						case 3: {
							printMainMenu(); 
						}
					}
	
					break;

				}
				
				case 2: {
					distanceConversions(scanner);
					int distanceSelection = scanner.nextInt();
					
					switch (distanceSelection) {
						
						case 1: {
							value1 = "Feet";
							value2 = "Meters";
							unit1 = userInput(value1, value2, scanner);
							unit2 = conversionCalculator(unit1, value1, value2);
							printConversionStatement();
							break;
						}
						
						case 2: {
							value1 = "Miles";
							value2 = "Kilometers";
							unit1 = userInput(value1, value2, scanner);
							unit2 = conversionCalculator(unit1, value1, value2);
							printConversionStatement();
							break;
						}
						
						case 3: {
							value1 = "Inches";
							value2 = "Feet";
							unit1 = userInput(value1, value2, scanner);
							unit2 = conversionCalculator(unit1, value1, value2);
							printConversionStatement();
							break;
						}
						
						case 4: {
							printMainMenu();
						}
					}
					break;
				}
	
				case 3: {
					weightConversions(scanner);
					int weightSelection = scanner.nextInt();
					
					switch (weightSelection) {
					
						case 1: {
							value1 = "Pounds";
							value2 = "Kilograms";
							unit1 = userInput(value1, value2, scanner);
							unit2 = conversionCalculator(unit1, value1, value2);
							printConversionStatement();
							break;
						}
						
						case 2: {
							value1 = "Kilogram";
							value2 = "Metric ton";
							unit1 = userInput(value1, value2, scanner);
							unit2 = conversionCalculator(unit1, value1, value2);
							printConversionStatement();
							break;
						}
						
						case 3: {
							value1 = "Ounce";
							value2 = "Pound";
							unit1 = userInput(value1, value2, scanner);
							unit2 = conversionCalculator(unit1, value1, value2);
							printConversionStatement();
							break;
						}
						
						case 4: {
							printMainMenu(); 
						}
					}
					
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
	
	public static void printConversionStatement() {
		System.out.println(unit1 + " " + value1 + " equals " + unit2 + " " + value2);
		
	}
	
	public static void printMainMenu() {
		System.out.println("Please select an option: ");
		System.out.println("1. Volume Conversions");
		System.out.println("2. Distance Conversions");
		System.out.println("3. Weight Conversions");
		System.out.println("4. Quit");
	}
	
	public static void volumeConversions(Scanner s) {
		System.out.println("Please select an option: ");
		System.out.println("1. Teaspoons to Tablespoons");
		System.out.println("2. Teaspoons to Cups");
		System.out.println("3. Quit");
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
		
	}
	
	public static void weightConversions(Scanner s) {
		System.out.println("Please select an option: ");
		System.out.println(" 1. Pounds to Kilograms");
		System.out.println(" 2. Kilogram to Metric ton");
		System.out.println(" 3. Ounce to Pound ");
		System.out.println(" 4. Quit ");	
		
	}
	
	public static double conversionCalculator(Double value, String value1, String value2) {

		if (value1 == "Teaspoons" && value2 == "Tablespoons") {
			return value / 3;
		} 
		
		else if (value1 == "Teaspoons" && value2 == "Cups") {
			return value / 48.692;
		} 
		
		else if (value1 == "Feet" && value2 == "Meters") {
			return value / 3.281;
		} 
		
		else if (value1 == "Miles" && value2 == "Kilometers") {
			return value * 1.609;
		} 
		
		else if (value1 == "Inches" && value2 == "Feet") {
			return value / 12;
		} 
		
		else if (value1 == "Pounds" && value2 == "Kilograms") {
			return value / 2.205;
		} 
		
		else if (value1 == "Kilogram" && value2 == "Metric ton") {
			return value / 1000;
		} 
		
		else if (value1 == "Ounce" && value2 == "Pound") {
			return value / 16;
		}
		
		return value;
		
		
	}
	

}
