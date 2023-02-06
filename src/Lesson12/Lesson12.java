package Lesson12;

import java.util.Arrays;

public class Lesson12 {
    public static void main(String[] args) {
        //Операции с массивами
        //Массивы не гибкие
        //Мы не можем в массив ничего добавить размер увеличить нельзя
        //Как увеличить массив ?

        //Самостоятельная работа№1
        //Нужно создать новый массив большего размера
        //скопировать в него данные из предыдшуего
        //доавить в конец элементы
        System.out.println("____TASK#1______");
        int [] a1={1,2,3,4};
        System.out.println(Arrays.toString(append(a1,5)));
        System.out.println("________________");
        //Самостоятельная работа№2
        //Нужно в массив вставить элемент в середину
        System.out.println("____TASK#2______");
        int [] a2={1,2,3,4,5,6};
        System.out.println(Arrays.toString(insert(a2,1,10)));
        System.out.println("________________");
    }
    //1
    public static int [] append(int []a,int number)
    {
        int [] ret = new int[a.length+1];
        for (int i = 0; i < a.length; i++) {
            ret[i]=a[i];

        }
                                               //добавить в конец элемент
        ret[ret.length-1]=number;
        return ret;
    }

    //2
    public static int [] insert(int[]a2,int index,int number)
    {
        int [] ret1 = new int[a2.length+1]; // увеличиваем массив на 1
                                            // скопировать все до индекса который нужен
        for (int i = 0; i <index ; i++) {
            ret1[i]=a2[i];

        }
        ret1[index]=number;
        for (int i = index+1; i <ret1.length ; i++) {
            ret1[i]=a2[i-1];
        }
        return ret1;
    }
}
