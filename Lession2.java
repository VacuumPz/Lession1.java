class Lession2 {
    public static void main(String[] args) {
        sumReturn(5, 10);
        System.out.println("The number is " + (checkPositive(-1)? "positive" : "negative"));
        checkNegative(10);
        stringPrint("Text", 5);
        System.out.println("The year is " + (year(1984)? "leap" : "not leap"));
    }

    static boolean sumReturn(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        else return false;
    }

    static boolean checkPositive(int a) {
        return a >= 0;
    }

    static boolean checkNegative(int a) {
        if (a < 0) return true;
        else return false;
    }

     static void stringPrint(String a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println(a);
        }
    }
    static boolean year(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) return true;
        else return false;
    }
}
