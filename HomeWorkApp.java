
public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(sum(10, 10));
        System.out.println(isPositiveNumber(1));
        System.out.println(isPositive(-1));
        printString("Hello", 8);
        System.out.println(isLeapYear(2021));
    }

    /**
     * 1
     */
    public static boolean sum(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    /**
     * 2
     */
    public static String isPositiveNumber(int a) {
        if (a < 0)
            return "Число отрицательное";
        else
            return "Число положительное";
    }

    /**
     * 3
     */
    public static Boolean isPositive(int a) {
        return a > 0;
    }

    /**
     * 4
     */
    public static void printString(String str, int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Отрицательное значение");
        }
        for (int i = 0; i < amount; i++) {
            System.out.println(str);
        }
    }


    /**
     * 5
     */
    public static Boolean isLeapYear(int year) {

        int i = year % 400;
        int j = year % 100;

        if (i == 0) {
            return true;
        }
        if (i % 4 == 0 && j != 0) {
            return true;
        } else return false;
    }
}

