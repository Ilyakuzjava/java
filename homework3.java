package ru.geekbrains.lesson_2;

import java.util.Arrays;

public class homework3 {

    public static void main(String[] args) {
        System.out.println("задание 1");
        int[] line = {1, 0, 1, 0, 1,};
        System.out.println(Arrays.toString(line));
        changezeroone(line);
        System.out.println(Arrays.toString(line));

        System.out.println("задание 2");
        int[] line2 = new int[100];
//        System.out.println(Arrays.toString(line2));
        fillupto100(line2);
        System.out.println(Arrays.toString(line2));

        System.out.println("задание 3");
        int[] line3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println(Arrays.toString(line3));
        multiply2(line3);
        System.out.println(Arrays.toString(line3));

        System.out.println("задание 5");
        int initialValue = 6;
        int size = 6;
        int [] line5 = newline5(initialValue,size);
        System.out.println(Arrays.toString(line5));

        System.out.println("задание 6");
        int[] line6 = {1,5,9,3,5,0};
        minmax(line6);



    }

    public static void changezeroone(int[] inputline) {
        for (int i = 0; i < inputline.length; i++) {
            inputline[i] = 1 - inputline[i];
        }
    }

    public static void fillupto100(int[] inputline2) {

        for (int i = 0; i < inputline2.length;i++){
            inputline2[i] = (i+1);

        }
    }
    public static void multiply2 (int[] inputline3) {
       for(int i = 0;i< inputline3.length;i++){
           inputline3[i]=(inputline3[i] < 6) ? (inputline3[i] * 2) : inputline3[i];
        }
    }

   public static int [] newline5(int initialValue, int size)
   {
   int[] result = new int[size];
   for(int i = 0;i< result.length;i++){
       result[i] = initialValue;
   }
   return result;
   }

   public static void minmax(int[] inputline6)
   {
       int min = inputline6[0];
       int max = inputline6[0];
       for(int i = 0; i< inputline6.length; i++)
       {
           if(min> inputline6[i])
           {
               min = inputline6[i];
           }
           if(max<inputline6[i])
           {
               max = inputline6[i];
           }
       }
       System.out.println("min - " + min);
       System.out.println("max - " + max);
   }
   
}






