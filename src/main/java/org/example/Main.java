package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FiftyEvenOrNonEven fiftyEvenOrNonEven = new FiftyEvenOrNonEven();
        System.out.println(Arrays.toString(fiftyEvenOrNonEven.getEvenNumber()));
        System.out.println(Arrays.toString(fiftyEvenOrNonEven.getNonEvenNumber()));

        int[] array = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        ArrayOperation arrayOperation = new ArrayOperation();
        arrayOperation.setMineArray(array);
        for(int i : arrayOperation.arrWhile()) {
            System.out.print(i + " ");
        }

        System.out.println();

        arrayOperation.setMineArray(array);
        for(int i : arrayOperation.arrFor()) {
            System.out.print(i + " ");
        }
    }
}