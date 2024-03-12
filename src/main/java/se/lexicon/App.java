package se.lexicon;

import java.util.Scanner;
import java.util.Arrays;

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
    }

    //indexOF method for ex02
    public static int indexOf(int[] array, int input) {
        Arrays.sort(array);
        int result = Arrays.binarySearch(array, input);
        return result;
    }
}

