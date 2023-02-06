package Lesson12;

import java.util.Arrays;

public class Lesson12HomeworkcCompleteTrouble2MarksTXT {
    public static void main(String[] args) {
        //
        //1
        int[] array = {10, 20, 30, 40};
        System.out.println(Arrays.toString(delete(array, 3)));
        //
        //
        //2
        System.out.println("___Homework#2___");
        System.out.println(checkBrackets("(())"));
        System.out.println(checkBrackets("()"));
        System.out.println(checkBrackets("((x)"));
        System.out.println(checkBrackets(")("));
        System.out.println(checkBrackets("()()"));
        System.out.println("________________");
        //
        //
        //3
        System.out.println("___Homework#3___");
        System.out.println(GetIndex(new int[]{1, 5, 7, 12, 15}, 7));
        System.out.println(GetIndex(new int[]{1, 5, 7, 12, 15}, 4));
        System.out.println(GetIndex(new int[]{1, 5, 7, 12, 15}, 400));
        System.out.println(GetIndex(new int[]{1, 5, 7, 12, 15}, 0));
        System.out.println("________________");
    }
    //1
    //Написать операцию public static int [] delete(int index) .
    // Пример: начальный массив [10,20,30,40]
    // удаляем элемент с индексом 2, получаем массив [10, 20, 40]

    public static int[] delete(int[] array, int index) {
        int[] result = new int[array.length - 1]; //инициализируем массив
        // в котором в финале будет отсутствовать удаленный элемент
        //так как мы прводим удаление он будет уменьшен на 1 индекс и элемент
        for (int i = 0; i < index; i++) { // мы запускаем цикл который будет считать от 0 до выбранного индекса
            // мы сами его зададим
            result[i] = array[i];           //элемент в новом массиве с удаленным элементом равен текущему массиву
        }
        for (int i = index + 1; i < array.length; i++) { // мы запускаем новый массив где мы задаем стартовым индекс и делаем его
            // равному тому индексу который мы задали но увеличиваем его на еденицу и ведем прогон по всей длине масива
            result[i - 1] = array[i]; // теперь тот самый подлежащий удалению индекс удаляется и его место занимает предыдущий
            // элемент из текущего массива
        }
        return result;

    }

    //2
//Напишите функцию проверяющую правильность расстановки скобок с строке,
// должна возвращать boolean. Примеры: "(())" -> true, "(1+(2-3))" -> true, "((x)" -> false, ")(" -> false
    public static boolean checkBrackets(String text) {
        int level = 0; // то есть мы устанавливем наального значения чтобы потом его прогонять по всему цикл
        for (int i = 0; i < text.length(); i++) { // запускаем цикл который прогоняет наш текст
            char c = text.charAt(i); // инициализируем чар для того чтобы его можно было найти в тексте
            //метод charAt
            //char charAt(int index) возвращает значение char по указанному индексу. Индекс колеблется от 0 до length()-1.
            //
            //То есть, первое char значение последовательности находится
            // в index 0, следующее — в index 1 и т.д., как и в случае с индексацией массива.
            switch (c) {
                case '(': // если скобка такая то проходим и ищем следующую и делаем стоп для продолжения происка других скобок

                    level++;
                    break;
                case ')':
                    if (level == 0) // если н найдиено незакрытыз открывающих скобок
                        return false;
                    else level--;//ищем в обратном порядке  и закрываем задачу
                    break;
            }
        }
        return level == 0;
    }

    //3
//Написать функцию которая принимает отсортированный массив и число.
// Возвращает позицию числа в массиве если число там уже есть либо индекс
// куда это число можно вставить не нарушив порядок сортировки массива findPlace({1,5,7,12,15}, 7) ->2
// findPlace({1,5,7,12,15}, 4) -> 1
//*Место, куда его можно вставить не нарушив порядок сортировки.

    //НЕПОНЯТНО
    public static int GetIndex(int[] a, int number) {
        for (int i = 0; i < a.length; i++) { // прогоняем массив
            if (number >= i) {  // если введенный номер элемента больше или равен элементу в массив
                return i; // возвращаем новый номер
            }
             // и возвращаем длину масива
        }
        return a.length;
    }
}
