package Lesson9;

import java.util.Arrays;

public class Lesson9Homework {
    public static void main(String[] args) {
        //1
        System.out.println("___Homework#1___");
        int[] a = {2, 7, 14};
        System.out.println(Summa(a));
        System.out.println("________________");

        //2
        System.out.println("___Homework#2___");
        System.out.println(Arrays.toString(a));
        ReverseBackwards(a);
        System.out.println(Arrays.toString(a));
        System.out.println("________________");
        System.out.println("___Homework#3___");
        //3
        //TODO
        System.out.println("________________");
        //4
        System.out.println("___Homework#4___");
        MultiplyPositiveBy2(a);
        System.out.println(Arrays.toString(a));
        System.out.println("________________");
        //5
        System.out.println("___Homework#5___");

        int[][] test2D = new int[10][10];
        test2D[5][5] = -2;
        System.out.println(checkPositive(test2D));
        System.out.println("________________");
        //6
        System.out.println("___Homework#6___");
        //TODO
        System.out.println("________________");
        //7
        System.out.println("___Homework#7___");
        //TODO
        System.out.println("________________");




    }

    //Домашняя работа №1
    // Написать функцию, возвращающую сумму всех
    // четных элементов передаваемого в нее массива. Пример {2, 17, 14} -> 16
    public static int Summa(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                sum += a[i];
        }
        return sum;
    }

    //Домашняя работа №2
    //Развернуть передаваемый в функцию массив задом наперед.
    // Пример {17, 4, 5} -> {5,4,17}
    public static void ReverseBackwards(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
    }

//Домашняя работа №3
//Создать двухмерный массив и заполнить его цифрами от 99 до 0

    //Я не пониманию процесса !!!!!
//TODO
//Домашняя работа №4
//Написать функцию которая умножает на 2 все положительные элементы передаваего в нее массива
    public static void MultiplyPositiveBy2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0)
                a[i] *= 2;

        }
    }

    //Домашняя работа№5
    public static boolean checkPositive(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0)
                    return false;
            }
        }
        return true;
    }
    //Домашняя работа №6
    //TODO
}


