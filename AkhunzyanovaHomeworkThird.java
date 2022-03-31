/**
* Java 1. Homework 2
* @author Guldar Akhunzyanova
* @version #1 29.03.2021
*/

import java.util.Scanner;

class AkhunzyanovaHomeworkThird {
    public static void main(String args[]) {
        print1DArray();
        fillRow();
        multiplyNumbersUnderSix();
        fillDiagonals();
        fillScanner();
    }
    static void print1DArray() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] == 1?  0 : 1);
        }
        System.out.println();
    }
    static void fillRow() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void multiplyNumbersUnderSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] < 6? arr[i] * 2 + " " : arr[i] + " ");
        }
        System.out.println();
    }
    static void fillDiagonals() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(i == j || arr.length - i - 1 == j? 1 : 0);
            }
            System.out.println();
        }
    }
    static void fillScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter len and initialValue: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] = b);
        }
    }
}
