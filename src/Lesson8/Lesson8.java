package Lesson8;

public class Lesson8 {
    public static void main(String[] args) {
        //Массивы
        int[] intArray = new int[]{15, 8, 10, -5}; // старый способ
        // ссылка на массив      //   0 1 2   3
        //массив - упорядоченный набор однотипных данных
        //массив - контейнер с переменными каждая из которых имеет вой порядковый номер

        System.out.println(intArray[0]);
        // изменение элемента массива
        intArray[0] = -33;
        System.out.println(intArray[0]);
        int[] newJavaArray = {10, 33, 44}; // новый способ


        //Нельзя увеличивать и уменьшать количество элементов в массиве

        // int 32 битный - максимальный размер массива 2 в 31 - 1 степени
        //сколько элементов в массиве

        System.out.println("length" + intArray.length);
        //напишите функцию которая принимает на вход массив
        //распечатывает все его элемены
        int kilo = 100;
        printArray(intArray);
        printInt(kilo);

        String [] names = new String []{"Dima","Max","Kolya"};
        System.out.println(names[2]);



        String [] newNames=names;
        newNames[1] = "Angelina;";
        printStringArray(names);

      //элементы инициализируются значениями по умолчанию
        int [] blankArray = new int[4];
        printArray(blankArray);
        //System.out.println(blankArray[10]);
        fillArrayFromZero(blankArray);
        printArray(blankArray);
 printStars(blankArray);
 printNChars(5,'@');

    }
public static void printStars(int []a)
{
    for(int i = 0;i<a.length;i++)
    {
        printNChars(a[i],'*');
        System.out.println();
    }
}
public static void printNChars(int n,char c)
{
    for(int i = 0;i<n;i++)
    {
        System.out.println(c);
    }
}
    public static void fillArrayFromZero(int [] a)
    {
        for(int i = 0;i < a.length;i++)
        {
            a[i] = i;
        }
    }
    public static void printStringArray(String []a)
    {
        for (int i = 0;i<a.length;i++)
        {
            System.out.println("ss"+a[i]);
        }
    }
    public static void printInt(int a)
    {
        System.out.println(a);
    }
         // а - ссылка на масив
    public static void printArray(int[] a)  {

        // 0 1 2 3  = всего 4
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i]="+a[i]);
        }

    }




}
