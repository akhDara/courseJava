class AkhunzyanovaHomeworkOne {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
          System.out.println(" Orange\n Banana\n Apple\n");
         /*  System.out.println("Orange");
           System.out.println("Banana");
           System.out.println("Apple"); */
    }
    static void checkSumSign() {
        int a = 8;
        int b = 5;
        int c = (a + b);
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    static void printColor() {
        int value = 376;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
        /* или else if (value > 0) {
            System.out.println("Зеленый");
        } но вроде излишне */
    }
    static void compareNumbers() {
        int a = 49;
        int b = 35;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
