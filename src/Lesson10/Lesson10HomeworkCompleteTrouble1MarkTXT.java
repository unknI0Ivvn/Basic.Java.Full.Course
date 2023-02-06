package Lesson10;

import java.util.Arrays;

public class Lesson10HomeworkCompleteTrouble1MarkTXT {
    public static void main(String[] args) {
        //1
        System.out.println("___Homework#1___");
        int[][] Array = {
                {1, 3, -6},
                {2, -5, -7, 7},
                {7, 8, 3}
        };
        System.out.println(FindNegattivesubArrays(Array));
        System.out.println("________________");
        //2
        System.out.println("___Homework#2___");
        //TODO
        //TROUBLE
        System.out.println("________________");
        //3
        System.out.println("___Homework#3___");
        int [] arrayToSort = new int []{4,7,-5,8,2};
        selectionSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println("________________");


    }

    //1
    //Напишите функцию, которая принимает двухмерный массив
    // и возвращает количество подмассивов с отрицательными элементами
    public static int FindNegattivesubArrays(int[][] a) {
        int count = 0;                              // счетчик - это то что будет показано под количеством найденных массивов
        for (int i = 0; i < a.length; i++) {        //дальше пробегаем по строке i
            for (int j = 0; j < a[i].length; j++) { // дальше пробегаем по строке j
                if (a[i][j] < 0)                    //элементы которые в этих подмассивах ниже
                    count++;                        //увеличиваем счетчик пи прогоняем следующие
                break;                              // чтобы закончить прогон
            }
        }
        return count;                               //возвращаем количество найденных элементов
    }


    //
    //2
    //Напишите функцию, которая принимает
    // на вход три массива и возвращает массив с максимами каждой из
    // "троек" числе public static int[] getMaximum(int [] a, int [] b, int [] c) -
    // массивы a, b и c одинаковой длины. Тройками считаютя a[0], b[0], c[0] ... a[n], b[n], c[n], n меняется от 0 до a.length-1

    //TODO
    //


    //3
    //* Написать алгоритм сортировки selection sort (сортировка выбором)

    public static int findMinimumArrayIndex(int from, int[] a)
    {
        int minIndex = from; //мы обозначали точку отсчета
        int minimum = a[minIndex]; // мы обозначали минимальный элемент в массиве
        for (int i = from +1;i<a.length;i++) // от точки отсчета отсупаем от индекса(то есть не 0 а 1) на 1 элемент и пробегаем по всему массиву
        // то есть если в массиве у нас 7 элементов и последний это 6 мы начинаем считать с первого индекса
            {
            if(a[i]<minimum)   // элемент массива если меньше нашего заданного минимального элемента
            {
                minimum=a[i]; // то запишем минимальный элемент в элемент массива
                minIndex=i; // миниальный индекс
            }
        }
        return minIndex; // возвращаем под каким индексом в массиве находится наименьший элемент
    }
    public static void swap(int firstIndex,int secondIndex,int []a)
    {
        int temp = a[firstIndex]; // мы записали во временную переменную элемент массива теперь нам его надо поменять
        a[secondIndex] = temp; // теперь второй элемент массива имеет значение первого
    }

    public static void selectionSort(int [] a)
    {
        for (int i = 0; i<a.length-1 ; i++) { //пробегаем по всему массиву
            //применяем написанную выше функцию замены элементов
            swap(i,findMinimumArrayIndex(i,a),a); //то есть мы меняем элементы в массиве используя функцию написанную выше

        }
    }
}
