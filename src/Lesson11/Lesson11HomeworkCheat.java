package Lesson11;

import java.util.Arrays;

public class Lesson11HomeworkCheat {
    public static void main(String[] args) {
        //Домашняя работа№1
        System.out.println("___Homework#1___");
        int[] a1 = {1, 2, 3, 4, 5, 6, 7};
        int[] a2 = {1, 2, 3, 3, 3, 3};
        System.out.println(getThirdBiggest(a1)); // 5
        System.out.println(getThirdBiggest(a2)); // 1
        //System.out.println(getThirdBiggest(new int []{1,10})); //1  - Для работы с исключением
        System.out.println("________________");
        //Домашняя работа№2
        System.out.println("___Homework#2___");
        System.out.println(Arrays.toString(getCommonElements(new int[]{55, 1, 2, 3, 4}, new int[]{1, 3, 55})));
        System.out.println("________________");
        //Домашняя работа №3
        System.out.println("___Homework#3___");
        System.out.println(calculateAverage(new double[]{1, 2, 3, 4}));
        System.out.println("________________");
        //Домашняя работа №4
        System.out.println("___Homework#4___");
        System.out.println(calculateDispersion(new double[]{1, 2, 3, 4}));
        System.out.println("________________");
        //Домашняя работа №5
        System.out.println("___Homework#5___");
        System.out.println(isInside(new int[]{10, 4, 2, 5, 10}, new int[]{10, 10}));
        System.out.println("________________");
        //Домашняя работа №6
        System.out.println("___Homework#6___");
        System.out.println(calculateArraySum(a2,0, a2.length)); // c какого сичтаем и до какого не включая сумму
        System.out.println("________________");
        //Домашняя работа №7
        System.out.println("___Homework#7___");
        System.out.println(calculateGCD(45,30));
        System.out.println("________________");
    }

    //1
    //Напишите функцию, которая вернет третье
    // по величине число в массиве.
    // Пример: 1 2 3 4 5 6 7 -> 5 и еще пример: 1 2 3 3 3 3   -> 1
    public static int getThirdBiggest(int[] a) {   /*
        if(a.length<3)
        throw new IllegalArgumentException("Размер массива меньще трех"); // Для работы с исключением
        */

        Arrays.sort(a);                 // Сортировка массива
        int counter = 3;                // Есть счетчик который мы будем уменьшать
        int prevMax = a[a.length - 1];  // у нас нет 7 элемента в массиве
        for (int i = a.length - 2; i >= 0 && counter > 1; i--) {
            if (a[i] < prevMax) {
                prevMax = a[i];
                counter--;
            }

        }
        return prevMax;
    }

    //2
    //Написать функцию которая вернет
    // в виде массива общие элементы двух массивов.
    // Пример: {1,2,3,4} {1,3,6,5} -> {1,3}
    public static int[] getCommonElements(int[] a, int[] b) {
        int size = Math.min(a.length, b.length);
        int[] c = new int[size];
        Arrays.sort(a); //{1,2,3,4} ia
        Arrays.sort(b); //  {1,3,5} ib
        for (int ia = 0, ib = 0, ic = 0; ia < a.length && ib < b.length; ) {
            if (a[ia] == b[ib]) {
                c[ic++] = a[ia];
                ia++;
                ib++;
            } else if (a[ia] < b[ib])

                ia++;
            else
                ib++;

        }

        int maxIndex = c.length - 1;
        for (int i = maxIndex; i >= 0; i--) {

            if (c[i] != 0) {
                maxIndex = i;
                break;
            }

        }
        int[] ret = new int[maxIndex + 1];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = c[i];
        }
        return ret;
    }

    //3
    //Напишите функцию которая вернет
    // среднее значение элементов массива double .
    // Пример: {1,2,3,4} -> 2.5
    public static double calculateAverage(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

        }
        return sum / a.length;
    }

    //4
    //Напишите функцию которая вернет
    // диcперсию значений массива double
    // (формулу для дисперсии можно посмотреть в википедии),
    // квадратный корень вычисляется с помощью Math.sqrt()
    public static double calculateDispersion(double[] a) {
        double average = calculateAverage(a);
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.pow((a[i] - average), 2);

        }
        return sum / (a.length - 1);
    }

    //5
    //Напишите функцию, в которую передаются два массива - "большой" и "маленький"
    // - функция должна вернуть true если все элементы "маленького" содержатся в "большом"
    //----------------------------------
    //Комментарии
    //10 2
    // 10 4 2 5
    //----------------------------------
    public static boolean isInside(int[] l, int[] s) {
        int[] c = getCommonElements(l, s);
        return c.length == s.length;
    }
    //6
    // Напишите функцию которая рекурсивно посчитает и вернет сумму элементов массива целых
    //----------------------------------
    //Комментарии
    // 0 1 2 3 4 5 6
    // 10 6 3 55 14 1 2
    //передаем в первом и в последнем 7
    // идея рекурсии в том что нужно найти место где алгоритм заканчивается
    // когда первый и последний ранвы
    //----------------------------------

    public static int calculateArraySum(int [] a,int firstIndex,int lastIndex)
    {
        if(firstIndex==lastIndex-1)
            return a[firstIndex];
        else{
            int middle =(firstIndex+lastIndex)/2;
            return calculateArraySum(a,firstIndex,middle) + calculateArraySum(a,middle,lastIndex);
        }
    }
    //7
    //Напишите функцию которая (желательно рекурсивно)
    // посчитает и вернет Наибольший Общий Делитель двух целых по алгоритму Евклида
    // (описание алгоритма можно посмотреть в википедии)
    public static int calculateGCD(int a,int b)
    {
        int result =a%b;
        if (result==0)
            return b;
        return calculateGCD(b,result);
    }
}
