package ru.Astondevs;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
    }

    public static void taskOne() {
        boolean keep = true;
        int number;
        while (keep) {
            System.out.print("Task 1. Enter a number: ");
            String input = sc.nextLine();
            try {
                number = Integer.parseInt(input);
            }
            catch (NumberFormatException exception) {
                System.out.println("Not a number");
                continue;
            }
            keep = false;
            if (number > 7)
                System.out.println("Привет");
        }
    }

    public static void taskTwo() {
        System.out.print("Task 2. Enter a name: ");
        String name = sc.nextLine();
        System.out.println(name);
        if (name.equalsIgnoreCase("Вячеслав"))
            System.out.println("Привет, " + name);
        else
            System.out.println("Нет такого имени");
    }

    public static void taskThree() {
        boolean keep = true;
        while (keep) {
            int[] arr;
            try {
                System.out.println("Enter an array of numbers, split with space");
                String array = sc.nextLine();
                String[] string = array.split(" ");
                arr = new int[string.length];
                for (int i = 0; i < string.length; i++) {
                    arr[i] = Integer.parseInt(string[i]);
                }
            }
            catch (NumberFormatException exception) {
                System.out.println("Wrong input");
                continue;
            }
            keep = false;
            System.out.print("Multiples of 3: ");
            for (int j : arr) {
                if (j % 3 == 0)
                    System.out.print(j + " ");
            }
        }
    }
    public static void taskFour() {
        System.out.println("Source array: [((())()(())]]");
        System.out.println("Correct array 1 - adding more brackets to equalize left and right ones: [[((())()(()))]]");
        System.out.println("Correct array 2 - removing extra brackets to equalize left and right ones: [(())()(())]");
        System.out.println("Correct array 3 - changing ] for ) to equalize brackets: [((())()(()))]");
    }
}
