package Lesson8;

import java.util.Arrays;

public class Lesson8Homework {
    public static void main(String[] args) {
        int[] array = new int[]{10, 2, 3, 4, 5, 6, 4, 5, 5, 5};
        //1
        FillArrayBackwards(array);
        //2
        System.out.println(Arrays.toString(getChars("Петя")));
        //3
        int [] a = new int []{-1,-1,-1,-2};
        System.out.println(GetPositiveNumbers(a));
        //4
        int b = 2;
        System.out.println(GetNumber(a,1));

    }

    //Домашнее задание №1
    //напишите функцию, принимающую на вход массив
    // int и заполняющую массив в обратном порядке -
    // если в массиве 10 элементов ,
    // то сделать значениями элементов 9,8,7 ... 0
    public static void FillArrayBackwards(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a.length - 1 - i;
            System.out.println("[" + i + "]" + a[i]);
        }
    }

    //Домашнее задание №2
    // напишите функцию, возвращающую массив из char
    // передаваемой в нее строки - "Петя" -> 'П', 'е', 'т', 'я' -
    // обратите внимания на метод String charAt
    public static char[] getChars(String text) {
        //Петя
        char[] c = new char[text.length()]; // '','','',''
        for (int i = 0; i < text.length(); i++)   //   0 1  2   3
        {
            //c[0] = Петя[0] = П

            c[i] = text.charAt(i);
        }
        return c;
    }
    //Домашняя работа 3
    //напишите функцию, которая определяет,
    // если в передаваемом массиве целых положительные числа, возвращает boolean
    public static boolean GetPositiveNumbers(int []a)
    {
        for(int i=0;i<a.length;i++){
            if (a[i]>0)
            return true;
        }
        return false;
    }
    //напишите функцию, которая определяет,
    // если в передаваемом массиве целых заданное целое число,
    // возвращает boolean - на вход функции передается массив целых и целое число

    public static boolean GetNumber(int []a,int b)
    {
        for(int i =0;i< a.length;i++) {
            if (a[i] ==b)
                return true;
        }
        return false;
    }
}
