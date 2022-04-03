/**
 * Java 1. Homework 3
 * @author Guldar Akhunzyanova
 * @version #2 29.03.2021
 */

import java.util.Arrays;


public class AkhunzyanovaHomeworkThird {
    public static void main(String[] args) {
        fillArray(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        print1DArray(new int[100]);
        multiplyNumbersUnderSix(new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        fillDiagonals(new int[5][5]);
        createArr(5, 9);


    }
    static void fillArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 1 - arr[i];
            }
            System.out.println(Arrays.toString(arr));
        }
    static void print1DArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void multiplyNumbersUnderSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void fillDiagonals(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    static void createArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}
