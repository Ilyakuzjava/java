package ru.geekbrains.lesson_2;

public class homework2 {
    public static void main(String[] args) {
        System.out.println("task 1");
        int b = 8;
        int c = 1;
        boolean numbersbetween = sumbetween( c ,b );
        System.out.println(numbersbetween);

        System.out.println("task 2");
        method2(5);

        System.out.println("task 3");
        int d = 3;
        boolean numberplusminus = plusminus(d);
        System.out.println(numberplusminus);

        System.out.println("task 4");
        print("java", 10);

        System.out.println("task 5");
        boolean year = yearhigh(2020);
        System.out.println(year);


    }
    public static boolean sumbetween (int b , int c)
    {
        int sum = c + b;
        return 10 < sum && sum <= 20;
    }
    public static void method2(int number)
    {

        if(number>=0)

        {

            System.out.println("число положительное");

        }   else
        {

            System.out.println("число отрицательное");

        }
    }
    public static boolean plusminus(int d)
    {
        return d<0;

    }
    public static void print ( String message , int count )
    {
        for(int a = 0 ; a < count ; a++)
        {
            System.out.println(message);
        }

    }
    public static boolean yearhigh (int a)
    {
        if ((a % 4 == 0 && a % 100 != 0 ) || a % 400 == 0)
        {
            return true;
            }
        else
        {
            return false;
        }
    }


    }


