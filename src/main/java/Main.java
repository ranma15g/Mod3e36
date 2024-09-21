/*

Class: COP 2800: Java Programming
Instructor: Francis Fiskey
*3.6 (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, feet, and inches.
For example, if a person is 5 feet and 10 inches, you will enter 5 for feet and 10 for inches.
Due: Sep 22 by 11:59pm
I pledge by honor that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Sign here:   
 ___Eric Snyder___

*/


import java.util.Scanner; // We are importing the Scanner class from java.util 

public class Main { // open the class block
  
  public static void main(String[] args) {  // open the main method block

      // Create the Scanner Object mon_input for grabbing the user input
      Scanner input = new Scanner(System.in);

      // Greet the user
      System.out.println("Welcome to Eric's BMI Calculator. Let's start collecting data!");

      // Prompt the user to enter weight in pounds
      System.out.print("\nEnter weight in pounds: ");
      double weight = input.nextDouble();

      // Prompt the user to enter height in feet
      System.out.print("\nEnter your height in feet please : ");
      int feet = input.nextInt();

      // Prompt the user to enter the remaining inches
      System.out.print("\nEnter the remaining inches please: ");
      int inches = input.nextInt();
  

      // Constants used for BMI conversion
      final double KILOGRAMS_PER_POUND = 0.45359237; // 1 pound is 0.45359237 kilograms
      final double METERS_PER_INCH = 0.0254; // There are .0254 meters in an inch
      final int INCHES_PER_FOOT = 12; // There are 12 inches in a foot

      // Calculate the total height in inches and weight in kilograms

      /* First step : We determine a person's BMI by first converting their height
        from feet and inches to meters and their weight from pounds to kilograms. */ 
    
      // First we calculate the total height in inches
      double heightInInches = (feet * INCHES_PER_FOOT) + inches;
      // We use feet * 12 because there are 12 inches in a foot

      // Next we convert heightInInches to meters
      double heightInMeters = heightInInches * METERS_PER_INCH;
      // there are 0.0254 meters in an inch

      // Next we conver from pounds to kilograms
      double weightInKilograms = weight * KILOGRAMS_PER_POUND;
      // there are 0.45359237 kilograms in a pound

      // Finally we calculate the BMI
      double bmi = weightInKilograms / (heightInMeters * heightInMeters);
      /* bmi is calculated by 
         weight in kilograms / (height in meters * height in meters) */

      // Create a placeholder for the weight category
      String bmi_listing;

      // Now we run a series of if statements to determine the weight category

      // According to the WHO, a BMI less than 18.5 is considered underweight.
      if (bmi < 18.5) { bmi_listing = "Underweight";}
        
      // According to the WHO, a BMI between 18.5 and 24.9 is considered normal.
      else if (bmi < 25) { bmi_listing = "Normal"; } 
        
      // According to the WHO, a BMI between 25 and 29.9 is considered overweight.
      else if (bmi < 30) { bmi_listing = "Overweight"; } 

      // According to the WHO, a BMI of 30 or higher is considered obese. 
      else { bmi_listing = "Obese"; }

      // Display the calculations based on input
        
      // First we print out their BMI
      System.out.println("\nThanks, here is your data.");
      System.out.println("\nYour BMI is " + bmi);

      // Next we print our their weight category
      System.out.println("Weight category: " + bmi_listing);

      // Now we wish them a nice day
      System.out.println("\n\nThank you for using Eric's BMI Calculator");

    }
}