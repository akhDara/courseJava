/**
* Java 1. Homework 2
* @author Guldar Akhunzyanova
* @version 29.03.2021
*/
class AkhunzyanovaHomeworkSecond {
    public static void main(String[] args) {
        System.out.println(compareSumOfNumbers(10, 5));
        System.out.println(printPositivOrNegativeNumber(0));
        System.out.println(comparePositivOrNegativeNumber(-133));
        printLoops(5);
        System.out.println(checkingTheLeapYear(1996));
        }
    static boolean compareSumOfNumbers(int a, int b) {
        return 10 <= a + b && a + b <= 20? true : false;
    }
    static String printPositivOrNegativeNumber(int a) {
        return a >= 0? "Положительное число" : "Отрицательное число";
    }
    static boolean comparePositivOrNegativeNumber (int a) {
        return a >=0? true : false;
    }
    static void printLoops(int a) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " строка");
        }
    }
    static boolean checkingTheLeapYear(int a) {
        return a % 4 == 0 & a % 100 != 0 ^ a % 400 == 0? true : false;
    }
}
