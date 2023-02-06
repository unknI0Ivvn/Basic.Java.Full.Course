package Lesson10;

import java.util.Arrays;

public class Lesson10 {
    public static void main(String[] args) {
        //1
        //Задача№1
        System.out.println("____TASK#1______");
        int[] array1D = {1, 2, 3, 4};
        System.out.println(Arrays.toString(array1D));
        System.out.println(print1Darray(array1D));
        System.out.println("________________");
        //2
        //Задача№2
        System.out.println("____TASK#2______");
        int[] arrayToSort = {12, -6, 7, 4, 10};
        print1Darray(arrayToSort);
        insertionSort(arrayToSort);
        System.out.println(print1Darray(arrayToSort));
        System.out.println("________________");

        //3
        //Задача№3
        System.out.println("____TASK#3______");
        String [] names = {"Sting","Kirkorov","Pink Floyd","Rammstein"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("________________");
        // 1 2 3 5 главы в книге
    }

    //Метод сортировки.Метод вставками.InsertionSort
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i; // i =2;j=2
            // 2>=1          7      < 12
            while (j >= 1 && a[j] < a[j - 1]) {
                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }

    public static String print1Darray(int[] a) {
        String res = "[";
        for (int i = 0; i < a.length; i++) {
            res += a[i];
            if (i != a.length - 1)
                res += ",";
        }
        res += "]";
        return res;


    }
    //Сортировки
    //{1,9,3,-5,81} ->
    //{-5,1,3,9,81}
    //Вычислительная сложность алгоритма определяется количеством операций
    //котрое нужно для того чтобы успешно завершить его в самом худжем случае
    //n 0(n) нам нужно только н операций мы условно пробежались
    // квадратичные и  более современные логорифмические
    //Insertion sort - сортировка вставками
    // квадратический и логорифмеческий
    //0(n) 1000 * 1000 = 100000
    //0(n*log(n)) 1000*3 = 3000
    //один логоритм может быстрее быть в года
    //Виды сортировок сотни
    //есть контейнер в нем несколько элементов
    //12 -6 7 4 10 сортировка вставками
    //мы начинаем с элемента 1 и сравниваем этот жлемент со всеми предыдушими элементами
    //-6 12 7 4 10 - поменяли превый с нулевым элементтом
    //берем 7 и сраниваем 12 видим что 7 меньше и меняем
    //-6 7 12
    // элемент номер 3 = 4 мы сравниваем 12 с 4 и меняем местами
    //                  -6 7 4 12 10
    //                4 меньше 7 и меняем местами
    // переходим к последнему элементу и меняем их местами
    //и если все то все сортировка завершена
    //главная идея что мы начинамем с первого элемента и продвигаемся врпаво меня их местами


}
