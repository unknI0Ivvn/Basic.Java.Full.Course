package Lesson12;

import java.util.Arrays;

public class Lesson12HomeworkCheat {
    public static void main(String[] args) {
        //РЕШАТЬ ЗАДАЧИ СНАЧАЛА НА ТЕТРАДКЕ
        //КАК ПОНЯТЬ
        //ЕСЛИ НУЖНО ПРОДВИГАТЬСЯ ПО КАКОМУ-ТО ОБЬЕМУ ДАННЫХ
        //ЦИКЛ
        //ЕСЛИ НУЖНО ПРОДВИГАТЬСЯ ВСЕГДА ПО ПОЛНОМУ ОБЬЕМУ ДАННЫХ
        //ТО ФОР
        //ЕСЛИ НУЖНО ПРОДВИГАТЬСЯ НО НЕ ДО КОНЦА
        //WHILE
        //ЕСТЬ ВОЗМОЖНОСТЬ ВЫПРАГНУТЬ ИСПОЛЬЗУЮ BREAK
        //CONTINUE КОГДА ТЕКУЩАЯ ОПЕРАЦИЯ ЕЩЕ НУЖНА
        //ПРОБРАСЫВАЕТ В НАЧАЛО СЛЕДУЮЩЕЙ ОПЕРАЦИИ

        //1
        //Домашнее задание№1
        System.out.println("___Homework#1___");
        int[] array = {10, 20, 30, 40};
        System.out.println(
                Arrays.toString(delete(array, 3))
        );
        System.out.println("________________");
        //2
        //Домашнее задание№2
        System.out.println("___Homework#2___");
        System.out.println(checkBrackets("(())"));
        System.out.println(checkBrackets("()"));
        System.out.println(checkBrackets("((x)"));
        System.out.println(checkBrackets(")("));
        System.out.println(checkBrackets("()()"));
        System.out.println("________________");
        //3
        //Домашнее задание№3
        System.out.println("___Homework#3___");
        System.out.println(findPlace(new int[]{1, 5, 7, 12, 15}, 7));
        System.out.println(findPlace(new int[]{1, 5, 7, 12, 15}, 4));
        System.out.println(findPlace(new int[]{1, 5, 7, 12, 15}, 400));
        System.out.println(findPlace(new int[]{1, 5, 7, 12, 15}, 0));
        System.out.println("________________");
        //3*
        //Домашнее задание№3*
        System.out.println("___Homework#3*___");
        //TODO
        System.out.println("________________");


    }

    //1
    //Написать операцию public static int [] delete(int index) .
    // Пример: начальный массив [10,20,30,40] удаляем элемент с индексом 2,
    // получаем массив [10, 20, 40]
    public static int[] delete(int[] array, int index) {
        int[] result = new int[array.length - 1];

        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        for (int i = index + 1; i < array.length; i++) {
            result[i - 1] = array[i];
        }
        return result;
    }

    //
    //2
    //Напишите функцию проверяющую правильность расстановки скобок с строке,
    // должна возвращать boolean. Примеры: "(())" -> true, "(1+(2-3))" -> true, "((x)" -> false, ")(" -> false
    public static boolean checkBrackets(String text) {
        //"(())"
        //"(1+2)+(4-3)"
        //")"False
        int level = 0;// сколько незакрытых открывающих скобок мы уже встретили
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                    level++;
                    break; // встетили еще одну открывающую скобку
                case ')':
                    if (level == 0)//если не найдено незакрытых открывающих скобок
                        return false;
                    else level--;//уже имеются незакрытые открывающие скобки уменьшаем их количество
                    break;
            }

        }
        return level == 0;
    }

    //
    //3
    //Написать функцию которая принимает отсортированный массив и число.
    // Возвращает позицию числа в массиве если число там уже есть либо индекс куда это число можно вставить
    // не нарушив порядок сортировки массива findPlace({1,5,7,12,15}, 7) ->2   findPlace({1,5,7,12,15}, 4) -> 1
    public static int findPlace(int[] a, int number) {
        //ПО ВСЕМ ЭЛЕМЕНТАМ
        for (int i = 0; i < a.length; i++) {
            if (number <= a[i])
                return i;
        }
        return a.length ;
    }
    //
    //3*
    //
    //TODO
    //
}
