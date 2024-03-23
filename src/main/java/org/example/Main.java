package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Task 1. Creating a random array of 50 numbers and alternately filling it with even and odd numbers.
        FiftyEvenOrNonEven fiftyEvenOrNonEven = new FiftyEvenOrNonEven();
        System.out.println(Arrays.toString(fiftyEvenOrNonEven.getEvenNumber()));
        System.out.println(Arrays.toString(fiftyEvenOrNonEven.getNonEvenNumber()));

        //Task 2. Operations with user`s array.
        System.out.println("Well, let's create a new array!");
        System.out.println("What size will your array be?");
        ArrayOperation arrayOperation = new ArrayOperation();
        int[] array = new int[scanner.nextInt()];
        System.out.println("Enter the integer elements of the array alternately and with a space)");
        for(int i = 0; i != array.length; i++){
            array[i] = scanner.nextInt();
        }

        //Task 2.1. Iterating the array with the while() loop.
        arrayOperation.setMineArray(array);
        System.out.println(Arrays.toString(arrayOperation.arrWhile()));

        //Task 2.2. Iterating the array with the for() loop.
        arrayOperation.setMineArray(array);
        System.out.println("Array output in ascending order - 1, in reverse order - 0: ");
        System.out.println(Arrays.toString(arrayOperation.arrFor(scanner.nextInt())));

        //Task 2.3. Looping through the array with the while() loop and displaying numbers with an odd array number on the screen.
        System.out.println("Looping through an array with a while() loop:");
        arrayOperation.setMineArray(array);
        int[] oddWhile = arrayOperation.arrWhile();
        System.out.print("[ ");
        for(int i = 0; i != oddWhile.length; i++){
            if(i % 2 == 1) {
                System.out.print(oddWhile[i] + " ");
            }
        }
        System.out.println("]");

        //Task 2.4. Looping through the array with the for() loop and displaying numbers with an even array number on the screen.
        System.out.println("Looping through an array with a for() loop.");
        arrayOperation.setMineArray(array);
        int[] evenFor = arrayOperation.arrFor(1);
        System.out.print("[ ");
        for(int i = 0; i != evenFor.length; i++){
            if((i % 2) == 0){
                System.out.print(evenFor[i] + " ");
            }
        }
        System.out.println("]");

        //Task 2.5. Array output in forward or reverse order.
        arrayOperation.setMineArray(array);
        System.out.println("Array output in ascending order - 1, in reverse order - 0: ");
        System.out.println(Arrays.toString(arrayOperation.arrFor(scanner.nextInt())));

        //Task 3. Calculate the sum of array elements in a one-dimensional array consisting of n real elements.
        System.out.println("Well, let's create a new array!");
        System.out.println("What size will your array be?");
        int[] really = new int[scanner.nextInt()];
        System.out.println("Enter the integer elements of the array alternately and with a space)");
        for(int i = 0; i != really.length; i++) {
            really[i] = scanner.nextInt();
        }
        arrayOperation.setMineArray(really);
        System.out.println("Sum of numbers of really array is " + arrayOperation.arrSum());

        //4. Change the sign of all odd array elements.
        System.out.println("Inversion of odd array elements: ");
        System.out.println(Arrays.toString(arrayOperation.arrInvertionOddNumbers()));
    }
}