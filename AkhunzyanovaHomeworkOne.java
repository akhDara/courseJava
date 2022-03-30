/**
* Java 1. Homework 1
* @author Guldar Akhunzyanova
* @version 29.03.2021
*/

class AkhunzyanovaHomeworkOne {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println(checkSumSign(79, 254));
        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
          System.out.println(" Orange\n Banana\n Apple\n");
         /*  System.out.println("Orange");
           System.out.println("Banana");
           System.out.println("Apple"); */
    }
    static String checkSumSign(int a,int b) {
        return a + b >= 0? "Сумма положительная" : "Сумма отрицательная";
        /* if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        } */
    }
    static void printColor() {
        int value = 97;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    static void compareNumbers() {
        int a = 49;
        int b = 35;
        /* if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        } */
        System.out.println(a >= b? "a >= b" : "a < b");
    }

}
