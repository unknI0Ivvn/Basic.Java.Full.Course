package Lesson10;

import java.util.Arrays;

public class Lesson10HomeworkCheat {
    public static void main(String[] args) {
        //ПРОЧИТАТЬ КНИГУ
        //ГЛАВЫ 1 2 3 5

        //1
        System.out.println("___Homework#1___");
        int[][] array = new int[][]{
                {1, 2, 3},
                {-3, 2, -4},
                {33}
        };
        System.out.println(calculateNumberofNegativeSubArrays(array));

        System.out.println("________________");
        //2
        System.out.println("___Homework#2___");
        int[] first = new int[]{1, 2, 3, 4};
        int[] second = new int[]{10, 20, -3, -4};
        int[] third = new int[]{-10, -20, -30, 40};
        System.out.println(
                Arrays.toString(
                        calculateMaximus(first, second, third)
                )
        );

        System.out.println("________________");
        //3
        System.out.println("___Homework#3___");
        int [] arrayToSort = new int []{4,3,-2,8,1};
        selectionSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println("___Задача для самопроверки___");
        System.out.println(getThirdBiggers(arrayToSort));
        System.out.println("_____________________________");

        System.out.println("________________");
        //Тернарный оператор
        System.out.println("___Тернарный оператор___");
        int temerature = 35;
        String WhenToGo = temerature > 30 ? "_________Walking_________" : "______Sit at Home_______";
        System.out.println(WhenToGo);
        System.out.println("_________________________");
        //Функция для сравнения
        System.out.println("__Функция для сравнения__");
        int m = 0; // 1 10 4 6
        m = Math.max(
                1,
                Math.max(
                        4, 6)
        );
        System.out.println(m);
        System.out.println("_________________________");

    }

    //Домашняя работа№1
    //Напишите функцию,
    // которая принимает двухмерный массив
    // и возвращает количество подмассивов
    // с отрицательными элементами
    public static int calculateNumberofNegativeSubArrays(int[][] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) //конкретный подмассив a[j]
            {
                if (a[i][j] < 0) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    //Домашняя работа№2
    //Напишите функцию, которая принимает на вход три массива
    // и возвращает массив с максимами каждой
    // из "троек" числе public static int[] getMaximum(int [] a, int [] b, int [] c)
    // - массивы a, b и c одинаковой длины.
    // Тройками считаютя a[0], b[0], c[0] ... a[n], b[n], c[n], n меняется от 0 до a.length-1

    public static int[] calculateMaximus(int[] a, int[] b, int[] c) {
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = max(
                    c[i],        //3
                    max(         //2
                            a[i],//2
                            b[i] //1
                    )
            );
        }
        return res;
    }

    public static int max(int a, int b) {
        return a > b ? a : b; // проверяем условие если условие истинаа то возворащаем а или б тернарный оператор
    }

    //Домашняя работа№3
    //Написать алгоритм сортировки selection sort (сортировка выбором)
    public static void selectionSort(int []a)
    {
        for (int i = 0; i < a.length-1; i++) {
         swap(
                 i,findMinimumArrayIndex(i,a),
                 a);
        }
    }
    /*
     * меняет местами элементы в массиве по индексам
     */
    public static void swap(int firstIndex, int secondIndex, int[] a) //идея в том что нам приходит массив и мы меняем там индекс
    {
        int temp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = temp;
    }

    /*
     * ишет индекс минимального элемента в массиве
     */
    public static int findMinimumArrayIndex(int from, int[] a)
    {
        int minIndex=from;
        int minimum =a[minIndex];
        for (int i=from +1;i<a.length;i++){
            if(a[i]<minimum)
            {
                minimum=a[i];
                minIndex=i;
            }

        }
        return minIndex;
    }

    /*
    Сортировка
    0 1  2 3 4
    ==========  // Наше задача найти мин значение и поменять его местами с нулевым лементом
    4 3 -2 8 1
    -2 3 4 8 1  //Дальше проделываем тоже самое но начиная с первого элемента
    -2 1 4 8 3  // со второго
    -2 1 3 8 4  // с третьего
    цикл от - до -2
     */
   //КЛАССНАЯ РАБОТА
    // ЗАДАЧА НА САМОПРОВЕРКУ
     //НАПИШИТЕ ФУНКЦИЮ КОТОРАЯ НАЙДЕТ ТРЕТЬЕ ПО ВЕЛИЧИНЕ ЧИСЛО В МАССИВЕ

    public static int getThirdBiggers(int[]a)
    {
        Arrays.sort(a);
        return a[a.length -3];
    }



}
