package se.lexicon;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class App
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
        //Keeping code out of main function and launching exercises
        ex01();
    }

    public static void ex01() {
        //1. Write a program which will store elements in an array of type ‘int’ and print it out.
        //Expected output: 11 23 39 etc.
        int[] numbers = {11, 23, 39, 51};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        ex02();
    }

    public static void ex02() {
        //2. Create a program and create a method with name ‘indexOf’ which will find and return the index
        // of an element in the array. If the element doesn’t exist your method should return -1 as value.
        // Expected output: Index position of number 5 is: 2.
        int[] numbers = {300, 700, 100, 800, 600, 400, 900, 200, 1000, 500};
        System.out.println();
        System.out.print("Please enter a number: ");
        int userInput = scanner.nextInt();
        int indexResult = indexOf(numbers, userInput);
        if(indexResult <0) {
            System.out.println("The number was not found!");
        }
        else {
            System.out.println("Index position of number " + userInput + " is " + indexResult);
        }
        ex03();
    }

    public static void ex03() {
        //3. Write a program which will sort string array.
        //Expected output: String array: [Paris, London, New York, Stockholm]
        //Sort string array: [London, New York, Paris, Stockholm]
        String[] cities = {"Paris","London", "New York", "Stockholm"};
        Arrays.sort(cities);
        System.out.println();
        for(String city : cities) {
            System.out.print(city + " ");
        }
        ex04();
    }
    public static void ex04() {
        //4. Write a program which will copy the elements of one array into another array.
        //Expected output: Elements from first array: 1 15 20
        //Elements from second array: 1 15 20
        int[] firstArray = {1,15,20};
        int[] secondArray = Arrays.copyOf(firstArray,3);
        System.out.println();
        System.out.println();
        for(int number : secondArray) {
            System.out.print(number + " ");
        }
        ex05();
    }

    public static void ex05() {
        //5. Create a two-dimensional string array [2][2]. Assign values to the
        //2-dimentional array containing any Country and City. Expected output: France Paris
        //Sweden Stockholm
        String[][] capitals = new String[2][2];
        capitals[0][0] = "\nFrance";
        capitals[0][1] = "Paris";
        capitals[1][0] = "\nSweden";
        capitals[1][1] = "Stockholm";
        System.out.println();
        for (String[] capital : capitals) {
            for (String s : capital) {
                System.out.print(s + " ");
            }
        }
        ex06();
    }

    public static void ex06() {
        //6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14
        // and print the average of these 6 numbers. Expected output: Average is: 17.3
        int[] numbers = {43,5,23,17,2,14};
        double sum = 0.0;
        for(int number : numbers) {
           sum = sum+number;
        }
        System.out.println();
        System.out.println();
        System.out.println("Average is: "+Math.round(sum/numbers.length * 10) /10.0);
        ex07();
    }

    public static void ex07() {
        //7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
        // Expected output: Array: 1 2 4 7 9 12
        // Odd Array: 1 7 9
        int[] fullArray = {1,2,4,7,9,12};
        System.out.println();
        System.out.print("Array: ");
        for (int i : fullArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Odd Array: ");
        for (int j : fullArray) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
        ex08();
    }

    public static void ex08() {
        //8. Write a program which will remove the duplicate elements of a given array
        // [20, 20, 40, 20, 30, 40, 50, 60, 50].
        // Expected output: Array: 20 20 40 20 30 40 50 60 50
        //Array without duplicate values: 20 40 30 50 60
        int[] originalArray = {20,20,40,20,30,40,50,60,50};
        System.out.println();
        System.out.println();
        System.out.print("Array: ");
        for(int i : originalArray) {
            System.out.print(i + " ");
        }
        //Efficient but cheating method using Java Stream
        System.out.println();
        System.out.print("1. Array without duplicate values: ");
        int[] nonDuplicateArray = Arrays.stream(originalArray).distinct().toArray();
        for(int j : nonDuplicateArray) {
            System.out.print(j + " ");
        }

        //Cumbersome but honest method
        System.out.println();
        System.out.print("2. Array without duplicate values: ");
        Arrays.sort(originalArray);
        int current = originalArray[0];
        boolean found = false;
        for (int k=0; k<originalArray.length; k++)  {
            if(current == originalArray[k] && !found) {
                found = true;
            } else if (current != originalArray[k]) {
                System.out.print(current + " ");
                current = originalArray[k];
                found = false;
            }
        }
        System.out.print(current + " ");
        ex10();
    }

    public static void ex10() {
        //Write a program which will represent multiplication table stored in multidimensional array.
        int [][] multiplicationTable = new int [10][10];
        System.out.println();
        System.out.println();
        for(int row=0; row<10; row++) {
            for(int col=0; col<10; col++) {
                multiplicationTable[row][col] = (row+1) * (col+1);
            }
        }
        for(int row = 0; row<multiplicationTable.length; row++){
            for(int col = 0; col<multiplicationTable[row].length; col++){
                System.out.print(multiplicationTable[row][col] + " ");
            }
            System.out.println();
        }

    }

    //indexOF method for ex02
    public static int indexOf(int[] array, int input) {
        Arrays.sort(array);
        return Arrays.binarySearch(array, input);

    }

    //9. Write a method which will add elements in an array.
    // Remember that arrays are fixed in size, so you need to come up with a solution to “expand” the array.
    public static int[] addIntToArray(final int[] source, int input) {
        int[] newArray = Arrays.copyOf(source,source.length+1);
        newArray[newArray.length-1] = input;
        return newArray;
    }
}

