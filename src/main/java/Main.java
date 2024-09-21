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
      Scanner scanner = new Scanner(System.in);

      // Prompt the user for their weight
      System.out.print("Enter weight in pounds: ");

      // Store their weight in a variable named weightInPounds
      double pounds = scanner.nextDouble();

      // Prompt the user for their height in feet
      System.out.print("Enter feet: ");

      // Store their foot height in a variable named feet        
      int feet = scanner.nextInt();

      // Prompt the user for their height in inches
      System.out.print("Enter inches: ");

      // Store their inch height in a variable named inches
      int inches = scanner.nextInt();


      // Calculate the total height in inches and weight in kilograms

      /* First step : We determine a person's BMI by first converting their height
        from feet and inches to meters and their weight from pounds to kilograms. */ 
        
      // First we calculate the total height in inches
      double heightInInches = (feet * 12) + inches;
      // We use feet * 12 because there are 12 inches in a foot

      // Next we convert the height from inches to meters
      double heightInMeters = heightInInches / 39.37; 
      // We use heightInInches 39.37 because there are 39.37 inches in a meter

      // Convert weight from pounds to kilograms
      double weightInKilograms = pounds / 2.2046; 
      // We use pounds / 2.2046 because there are 2.2046 pounds in a kilogram

      // Calculate BMI
      double bmi = weightInKilograms / (heightInMeters * heightInMeters);
      /* To calculate BMI, a person's weight in kilograms is divided 
          by the square of their height in meters. */

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

        // Display results
        System.out.println("BMI is: " + bmi);
        System.out.println("Weight category: " + bmi_listing);
    }
}