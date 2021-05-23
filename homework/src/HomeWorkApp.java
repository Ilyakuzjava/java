public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("orange");
        System.out.println("banana");
        System.out.println("apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -8;
        int c = a + b;
        if (c >= 0) {
            System.out.println("сумма положительна");
        } else {
            System.out.println("сумма отрицательна");
        }
    }
    public static void printColor() {
        int value = 50;
        if (value <= 0)
        {
            System.out.println("красный");
        }
        else if (value > 0 && value <= 100)
        {
            System.out.println("желтый");
        }
        else if (100 < value)
        {
        System.out.println("зеленый");
        }
        }

        public static void compareNumbers() {
            int a = 5;
            int b = 8;
            if (a >= b) {
                System.out.println(" a>=b");
            } else {
                System.out.println("a<b");
            }
        }

        }







