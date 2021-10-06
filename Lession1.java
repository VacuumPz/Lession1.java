class Lession1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 14;
        int b = 88;
        int sum = a + b;
        System.out.println(sum >= 0? "Sum positive" : "Sun negative");

    }
    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Red");
        }
        else if (value > 0 & value <= 100) {
            System.out.println("Yellow");
        }
        else {
            System.out.println("Green");
        }

    }
    public static void compareNumbers() {
        int a = 2;
        int b = 3;
        System.out.println(a >= b? "a >= b" : "a < b");

    }
}