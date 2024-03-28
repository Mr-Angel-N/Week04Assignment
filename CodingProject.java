package week04practice;

import java.util.Scanner;

public class CodingProject {

  public static void main(String[] args) {
    
//1.a.// Create an array of int called ages
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

    // Subtract the value of the first element from the value in the last element
    int result = ages[ages.length - 1] - ages[0];

    // Print the result to the console
    System.out.println("Result 1a: " + result);
    
//1.b.//Create a new array of int called ages2 with 9 elements
    int[] ages2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    
    //Repeat the subtraction from Step 1.a.
    int result2 = ages2[ages2.length - 1] - ages2[0];
    
    // Print the result to the console
    System.out.println("Result 1b: " + result2);
    
//1.b.iii.//Show that using the index values for the elements is dynamic (works for arrays of different lengths).
    int[] ages3 = {1, 2, 3}; // 3 elements
    int[] ages4 = {1, 2, 3, 4, 5}; // 5 elements
    int[] ages5 = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 8 elements

    // Calculate the result for each array
    int result3 = ages3[ages3.length - 1] - ages3[0];
    int result4 = ages4[ages4.length - 1] - ages4[0];
    int result5 = ages5[ages5.length - 1] - ages5[0];

    // Print the results to the console
    System.out.println("Result for ages3: " + result3);
    System.out.println("Result for ages4: " + result4);
    System.out.println("Result for ages5: " + result5);
    
//1.c.//Use a loop to iterate through the array and calculate the average age.
    // Calculate the sum of ages
    int sum = 0;
    for (int i = 0; i < ages.length; i++) {
        sum += ages[i];
    }

    // Calculate the average age
    double averageAge = (double) sum / ages.length;

    // Print the average age to the console
    System.out.println("Average age: " + averageAge);
    
//2.//Create an array of String called names
    String[] names = {"Sam","Tommy", "Tim", "Sally", "Buck", "Bob"};
    
//2.a.//Use a loop to iterate through the array and calculate the average number of letters per name.
    // Calculate the total number of letters
    int totalLetters = 0;
    for (String name : names) {
        totalLetters += name.length();
    }

    // Calculate the average number of letters per name
    double averageLetters = (double) totalLetters / names.length;

    // Print the average number of letters per name to the console
    System.out.println("Average number of letters per name: " + averageLetters);

//2.b.// Use a loop to iterate through the array again and concatenate all the names together, separated by spaces
 // Concatenate all the names together with spaces
    StringBuilder concatenatedNames = new StringBuilder();
    for (int i = 0; i < names.length; i++) {
        concatenatedNames.append(names[i]);
        if (i < names.length - 1) {
            concatenatedNames.append(" ");
        }
    }

    // Print the concatenated names to the console
    System.out.println("Concatenated names: " + concatenatedNames);
    
//3.//How do you access the last element of any array?
    System.out.println("use ( .length -1 )");
    
//4.// How do you access the first element of any array?
    System.out.println("use ( \'element\'[] )");
    
//5.//Create a new array of int called nameLengths.
    int[] nameLengths = new int[names.length];

    // Loop to iterate over the names array
    for (int i = 0; i < names.length; i++) {
    // Add the length of each name to nameLengths array
        nameLengths[i] = names[i].length();
    }
    
//6.//Write a loop to iterate over the nameLengths array and calculate the sum
    // Calculate the sum of all elements in nameLengths array
    int sumNameLengths = 0;
    for (int length : nameLengths) {
        sumNameLengths += length;
    }
    System.out.println("Sum of all name lengths: " + sumNameLengths);
    
//07.//Method usage:
    String repeatedWord = repeatWord("hello", 3);
    System.out.println(repeatedWord); 
    
//08.//Method usage:
    String fullName = getFullName("Angel", "Nunez");
    System.out.println(fullName); 
    
//09.//Method usage:
    int[] numbers = {20, 30, 50, 10}; 
    boolean isSumGreaterThan100 = isSumGreaterThan100(numbers);
    System.out.println("Is sum greater? " + isSumGreaterThan100); 
    
//10.//Method usage:
    double[] arr1 = {9.5, 30.3, 11.7, 23.2}; 
    double average = calculateAverage(arr1);
    System.out.println("Average: " + average); 
    
//11.//Method usage:
    double[] arr2 = {10.5, 20.7, 15.3, 8.6};
    double[] arr3 = {12.3, 18.9, 14.6, 9.8}; 
    boolean averageResult = compareAverages(arr2, arr3);
    System.out.println("Is average of \'arr2\' greater than average of \'arr3\'? " + averageResult); 
    
//12.//Method usage:
    boolean isHotOutside = true;
    double moneyInPocket = 15.75;
    boolean drinkResult = willBuyDrink(isHotOutside, moneyInPocket);
    System.out.println("Will buy drink? " + drinkResult); 
    
//13.//Method usage for Personal Creation:
    // Create a Scanner object to read input from the console
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter days of the week until they enter "exit"
    String dayOfWeek;
    do {
        System.out.print("Enter a day of the week (or 'exit' when done): ");
        dayOfWeek = scanner.nextLine();

        // If the user enters "exit", end the loop
        if (dayOfWeek.equalsIgnoreCase("exit")) {
            break;
        }

        // Call the method to determine the designated car for the entered day
        String designatedCar = getDesignatedCar(dayOfWeek);

        // Display the designated car for the entered day
        System.out.println("The designated car for " + dayOfWeek + " is: " + designatedCar);
    } while (true);

    // Close the scanner to release system resources
    scanner.close();
}    
  
//7.//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
    public static String repeatWord(String word, int n) {
      StringBuilder repeated = new StringBuilder();
      for (int i = 0; i < n; i++) {
          repeated.append(word);
      }
        return repeated.toString();
    }
    
//8.//Write a method that takes two Strings, firstName and lastName, and returns a full name
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
      }
      
//9.//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100
    public static boolean isSumGreaterThan100(int[] numbers) {
      int sum = 0;
      for (int number : numbers) {
            sum += number;
        }
        return sum > 100;
    }
      
//10.//Write a method that takes an array of double and returns the average of all the elements in the array.
    public static double calculateAverage(double[] arr1) {
      if (arr1.length == 0) {
          return 0; // Return 0 if array is empty to avoid division by zero
      }
      double sum = 0;
      for (double num : arr1) {
          sum += num;
      }
        return sum / arr1.length;
  }  
      
//11.//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.      
    public static boolean compareAverages(double[] arr1, double[] arr2) {
      double average1 = calculateAverage(arr1);
      double average2 = calculateAverage(arr2);
      return average1 > average2;
  }
    
//12.//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        // Check if it is hot outside and if money in pocket is greater than 10.50
        return isHotOutside && moneyInPocket > 10.50;
    }
    
//13.//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
    
    //I decided to create this due to actually owning these vehicles and would like to have an organized rotation.
    
    // Method to determine the designated car for a given day of the week
    public static String getDesignatedCar(String dayOfWeek) {
        // Convert the input to lowercase for case-insensitive comparison
        dayOfWeek = dayOfWeek.toLowerCase();

        // Determine the designated car based on the day of the week
        switch (dayOfWeek) {
            case "monday":
                return "Infiniti G35";
            case "tuesday":
                return "Nissan Pathfinder";
            case "wednesday":
                return "Infiniti Fx35";
            case "thursday":
                return "Nissan Z32";
            case "friday":
                return "Nissan Titan";
            case "saturday":
              return "Nissan Z31 (racecar)";
          case "sunday":
              return "Free option day!";
            default:
                return "Invalid Entry";
        }
    }
    
}