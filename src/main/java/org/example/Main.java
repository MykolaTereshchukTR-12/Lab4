package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FiftyEvenOrNonEven fiftyEvenOrNonEven = new FiftyEvenOrNonEven();
        System.out.println(Arrays.toString(fiftyEvenOrNonEven.getEvenNumber()));
        System.out.println(Arrays.toString(fiftyEvenOrNonEven.getNonEvenNumber()));

        //Change this line for more universal array
        int[] array = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        ArrayOperation arrayOperation = new ArrayOperation();
        arrayOperation.setMineArray(array);
        System.out.println(Arrays.toString(arrayOperation.arrWhile()));

        arrayOperation.setMineArray(array);
        System.out.println("Array output in ascending order - 1, in reverse order - 0: ");
        System.out.println(Arrays.toString(arrayOperation.arrFor(scanner.nextInt())));

        arrayOperation.setMineArray(array);
        System.out.print("[ ");
        for(int i : arrayOperation.arrWhile()){
            if((i % 2) != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("]");

        arrayOperation.setMineArray(array);
        System.out.print("[ ");
        for(int i : arrayOperation.arrFor(1)){
            if((i % 2) == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("]");

        arrayOperation.setMineArray(array);
        System.out.println("Array output in ascending order - 1, in reverse order - 0: ");
        System.out.println(Arrays.toString(arrayOperation.arrFor(scanner.nextInt())));

        int[] really = new int[scanner.nextInt()];
        for(int i = 0; i != really.length; i++) { really[i] = scanner.nextInt(); }
        arrayOperation.setMineArray(really);
        System.out.println("Sum of numbers of really array is " + arrayOperation.arrSum());
        System.out.println("Inversion of no even numbers: ");
        System.out.println(Arrays.toString(arrayOperation.arrFor(0)));
    }
}