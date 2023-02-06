package Lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        // int boolean float char - примитивный == по значению
        // String - ссылочный == по адресу в памяти,qeuals сравнение по значению

/*
        String a = "DIMA";
        String b = "dima".toUpperCase();
        //String b = "DIMA";
        System.out.println("a:"+a);
        System.out.println("b:"+b);

         // boolean result = a == b;
        //boolean result = a.equals(b);
        System.out.println("DIMA ==DIMA "+ a==b);
        System.out.println("DIMA.equals(DIMA)"+a.equals(b)); // ДЛЯ ССЫЛОЧНЫХ ТИПОВ
    */
        //Цикл - блок кода,который потенциальное может повторятся несколько раз
        // в зависимости от условия
    /*
    while(<>)
    {
    <выполняется блок кода если логическое выражение == true>
     }
     */
        int number = 1;
        while (number < 10) // 10 < 10 is false //условие прекратилось дошло от 1 до 10 10 не учитывается
        {
            //System.out.println("number is"+ number++); // отсчет с единицы и увелечение на 1
            System.out.println("number is" + ++number);//если ++ перед то увеливает стар на 1
            //number = number +1;
            //number +=1;
            number++; // если два ++ через шаг идет
        }

        int a = 18;
        a = a * 8; // a *=8
        a = a - 8;//a -=8
        a = a % 3;//a %= 3;
        // Напишите цикл который печатет цифры с 20 до 5 с шагом -2

        int counter = 20;
        while (counter > 5) {
            System.out.println("counter is" + counter);
            counter = counter - 2;

        }

        //посчитать сумму всех чисел от 1 до 87 включительно
        //до 20 46
        int summa = 0;
        int ss = 1;
        while (ss <= 87) {

            summa = summa + ss;
            ss = ss + 1;
        }
        System.out.println("summa" + summa);

        //FizBuzz
        // пробежаться в цикле от 1 до 50 с шагом 1
        //если переменная цикла делится на 3 бе остатка печатать fizz
        //если переменная цикла делится на 5 без остатка печатать buzz
        // если переменная цикла делится и нв 3 и на 5 без остатка печатать Fizzbuzz

        int h = 1;
        while (h <= 50)
        {
            if (h % 3 == 0 && h % 5==0)  {
            System.out.println("FizzBuzz" + h);
        }
            else if (h % 3 == 0) {
                System.out.println("Fizz"+h);

            } else if (h % 5 == 0) {
                System.out.println("Buzz"+h);
            }
            h++;

        }
    }
}

