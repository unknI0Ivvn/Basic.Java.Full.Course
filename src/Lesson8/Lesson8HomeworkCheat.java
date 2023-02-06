package Lesson8;

import java.util.Arrays;

public class Lesson8HomeworkCheat {
    public static void main(String[] args) {
        int[] intArray = new int[]{15, 444, -90, -2};
        //                           0 1    2    3
        System.out.println(intArray[2]); // номер ящика 2 значение там - 90
        intArray[1] = 555;
        printArray(intArray);
        System.out.println("array length is:" + intArray.length);
        System.out.println(Arrays.toString(intArray));


        int[] array = new int[]{11, -12, 44}; // констттруирование массива
        //System.out.println(array);
        System.out.println("______");
        printArray(array);
        System.out.println("________________");
        fillArrayBackwards(array);
        printArray(array);

        //2
        System.out.println(Arrays.toString(getChars("Петя")));
        System.out.println("_____");
        // 3
        int[] negativeArray = new int[]{-1, -10};
        System.out.println(hasPositive(negativeArray));
        System.out.println("______");
        //4
        System.out.println(findNumber(negativeArray, -10));
        //5
        System.out.println(hex2Bin("1abd"));
    }

    public static void printArray(int[] a) // для того чтобы напечатать масив в начале и в конце
    {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]");

        }
    }

    //Домашняя работа№1
    //апишите функцию, принимающую на вход массив int
    // и заполняющую массив в обратном порядке -
    // если в массиве 10 элементов , то сделать значениями элементов 9,8,7 ... 0
    public static void fillArrayBackwards(int[] a) {
        /// 2 1 0
        for (int i = 0; i < a.length; i++) {
            a[i] = a.length - 1 - i;
            //a[0] = 3 - 1 - 0 =2;
            System.out.println("[" + i + "]");
        }

    }

    //Домашняя работа№2
    //напишите функцию, возвращающую массив из char
    // передаваемой в нее строки -
    // "Петя" -> 'П', 'е', 'т', 'я' - обратите внимания на метод String charAt
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

    //Домашняя работа №3
    //апишите функцию,
    // которая определяет, если в
    // передаваемом массиве целых положительные числа, возвращает boolean
    public static boolean hasPositive(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0)
                return true;
        }
        return false;
    }

    //Домашняя работа №4
// напишите функцию, которая определяет,
// если в передаваемом массиве целых заданное целое число,
// возвращает boolean - на вход функции передается массив целых и целое число
    public static boolean findNumber(int[] a, int b) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == b)
                return true;
        return false;
    }

    //Домашняя работа№5
    //* напишите функцию,
    // которая для передаваемого туда шестнадцатиричного числа
    // в виде строки возвратит его двоичную запись в виде строки  "1abd" -> "0001 1010 1011 1101"
    public static String hex2Bin(String h) {
        String ret = " ";
        //1abd
        //0123
        for (int i = 0; i < h.length(); i++)
        {
            ret += hexChar2Bin(h.charAt(i));
            ret += "";
        }
        return ret;
    }

    public static String hexChar2Bin(char h) {
        return switch (h) {
            case '0' -> "0000";
            case '1' -> "0001";
            case '2' -> "0010";
            case '3' -> "0011";
            case '4' -> "0100";
            case '5' -> "0101";
            case '6' -> "0110";
            case '7' -> "0111";
            case '8' -> "1000";
            case '9' -> "1001";
            case 'a' -> "1010";
            case 'b' -> "1011";
            case 'c' -> "1100";
            case 'd' -> "1101";
            case 'e' -> "1110";
            case 'f' -> "1111";
            default -> "XXXX";
        };


    }
}

