package Lesson9;

import java.util.Arrays;

public class Lesson9HomeworkCheat {
    public static void main(String[] args) {

        //1
        int[] test = {2, 17, 14};
        System.out.println(calculateEvenNumber(test));

        //2
        System.out.println(Arrays.toString(test));
        reverseArray(test);
        System.out.println(Arrays.toString(test));

        //3
        print1Darray(test);
        int[][] test2D = new int[10][10];
        //int k = 99;
        for (int i = 0; i < test2D.length; i++) {
            for (int j = 0; j < test2D[i].length; j++) {
                //test2D[i][j]=k--;
                test2D[i][j] = (test2D.length - 1 - i) * 10 + (test2D[i].length - j - 1);
            }
        }
        print2Darray(test2D);
        System.out.println("______________________________________");

        //4
        int[] testPositivity = new int[]{1, -4, -8, 2};
        print1Darray(testPositivity);
        multiplyPositiveBy2(testPositivity);

        //5
        test2D[5][5] = -2; //мы заменили один элемент в массиве
        System.out.println(checkPositive(test2D));
        //6
        int[][] testPositive = new int[][]{
                {1, 2, 3},
                {-11},
                {34, -3}
        };
        System.out.println(check2DPositive(testPositive));
        //7
        System.out.println(calculate2DPositiveSum(testPositive));
    }

    //Домашнее задание№1
    public static int calculateEvenNumber(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                sum += a[i];
        }

        return sum;
    }

    //Домашнее задание №2
    public static void reverseArray(int[] a) {
        //0 1 2 3
        //3 5 6 1->1 6 5 3
        //0 1 2
        //17 4 5
        //Запускать цикл до половины длины
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }


    //Домашнее задание №3
    //
    public static void print2Darray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            print1Darray(a[i]);
        }
    }


    //Подсказки

    /// option command l - форматирование
    /// поставить брейпоинт на цикл в функции и нажать на дебагер,там появится возможность
    /// ходить по коду и смотреть что в нем происходит


    public static void print1Darray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    //Домашнее задание №4
    public static void multiplyPositiveBy2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0)
                a[i] *= 2;
        }
    }

    //Домашнее задание №5
    public static boolean checkPositive(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0)
                    return false;
            }
        }
        return true;
    }

    //Домашнее задание №6
    public static int check2DPositive(int[][] a) {
        int numberOfPositive = 0;
        for (int i = 0; i < a.length; i++) {
            boolean flagOnlyPositive = true;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0) {
                    flagOnlyPositive = false;
                    break;
                }
            }
            if (flagOnlyPositive)
                numberOfPositive++;
        }
        return numberOfPositive;
    }

    //Домашнее задание №7
    public static int calculate2DPositiveSum(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            boolean hasPositive = true;
            int subArraySum = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0) {
                    hasPositive = false;
                    break;
                }
                subArraySum += a[i][j];
            }
            if (hasPositive)
                sum += subArraySum;
        }
        return sum;
    }
}
