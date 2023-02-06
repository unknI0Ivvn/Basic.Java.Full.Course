package Lesson5;

public class Lesson5Homework {
    public static void main(String[] args) {
        //Написать функцию которая возвращает true если число положительное и делится на 3 без остатка
        int number = 8923235;
        if (number > 0 & number % 3 == 0) {
            System.out.println("Число: " + number + " делится на 3 без остатка и положительное,подходит по условию");
        } else if (number < 0 & number % 3 != 0) {
            System.out.println("Число: " + number + " не делится на 3 без остатка,и отрицательное,не подходит по условию");

        } else if (number > 0 & number % 3 != 0) {
            System.out.println("Число: " + number + " не делится на 3 без остатка,но положительные,не подходит по условию");
        } else if (number < 0 & number % 3 == 0) {
            System.out.println("Число: " + number + " делится на 3 без остатка,но отрицательное,не подходит по условию");
        }
//Напишите функцию которая возвращает true если число находится в диапазоне от 150 до 180 и при этом четное
        int a = 155;
        if (a >= 150 & a % 2 == 0 && a <= 180 & a % 2 == 0) {
            System.out.println("Число: " + a + " находится в диапозоне от 150 до 180 и четное,подходит по условию");
        } else {
            System.out.println("Число: " + a + " не подходит по условию");
        }
        //Напишите функцию которая принимает на вход номер дня недели (1-7) и возвращает строку с названием дня
        System.out.println(weekDay(7));

        //год, номер которого кратен 400, — високосный;
        //остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
        //остальные годы, номер которых кратен 4, — високосные[5].
        //все остальные годы — невисокосные.

        System.out.println(leapYear(2036));

         // Напишите функцию-калькулятор валюты которая принимает на вход сумму в евро и символ в какую валюту конвертировать(int,char)
         // (F - венгерские форинты, R - рубли, D - доллары США, для всех остальных конвертировать в монгольские тугрики).
        // Возвращает сумму в другой валюте.


        System.out.println(currencyExchange(579,1));

        System.out.println(currencyExchange2(148,'D'));
        //Первая домашняя(в Классе)
        System.out.println(isPositiveandDevidedBy3(36));
        System.out.println(isPositiveandDevidedBy3(23));
        System.out.println(isPositiveandDevidedBy3(-9));
        //Вторая домашняя(в Классе)
        System.out.println(isBetween150and180AndEven(154));
        System.out.println(isBetween150and180AndEven(232));
        System.out.println(isBetween150and180AndEven(178));
        //boolean result = isPositiveandDevidedBy3(6) & isBetween150and180AndEven(160);
        boolean result = isPositiveandDevidedBy3(6) && isBetween150and180AndEven(160);
        System.out.println(result);
        //Третья домашняя(в Классе)
        System.out.println(getWeekDay(7));
        System.out.println(getWeekDay(12));
        //Четвертая домащняя(в Классе)
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(1980));
        //Пятая домашняя(в Классе)
        System.out.println(convertCurrency(20,'F'));
    }
    //Выражение 1 | Выражение2 - выполняются обе части выражения
    //Выражение 1 ||Выражение 2 - выражение 2 выполняется только если выраэение 1 == false

    //1 домашнее задание(в Классе)
    public static boolean isPositiveandDevidedBy3(int number)
    {
        System.out.println(" isPositiveandDevidedBy3" );
        boolean result = number > 0 & number % 3 ==0;
        return result;
       // return number >0 & number % 3 == 0; // Почему одинарный &
        //& выполняются обе части выражения выражение 1 и выражение 2
        //&& выражение 1 && выражение 2 - выражение 2 выполняются только есть выражение 2 ==true
    }

    //2 домашнее задание(в Классе)
    public static boolean isBetween150and180AndEven(int number)
    {
        System.out.println(" isBetween150and180andEven" );
        return number % 2 == 0 & number >=150 & number <=180;
    }
    //3 домашнее задание(в Классе)
    public static String getWeekDay(int day)
    {
        String result = "Неизвестный день";
        if (day == 1)
        {
            result = "Понедельник";
        }
        else if(day ==2)
        {
            result = "вторник";
        }
        else if (day == 3)
        {
            result = "Среда";
        }
        else if (day == 4)
        {
            result = "Четверг";
        }
        else if (day == 5)
        {
            result = "Пятница";
        }
        else if(day == 6)
        {
            result = "Суббота";
        }
        else if (day == 7)
        {
            result = "Воскресенье";
        }
        else { result = "Не существует";}
        return result;
    }
    //4 домашнее задание(в Классе)
    public static boolean isLeapYear(int year)
    {
        return year % 400 == 0 ||(year % 100 !=0 && year % 4 == 0);
    }
    //5 домашнее задание(в классе)
    public static double convertCurrency(double euro,char currency)
    {
        double result = 0;
        if(currency =='F'){
            return euro*380.56;
        }else if (currency =='R' )
        {
            return euro*71.45;
        }else if(currency=='D')
        {
            return euro*1.05;
        }
        else {
            return euro*3263.31;
        }

    }
    // 4 домашнее задание(Дома)
    public static String leapYear(int y)
    {
        if ((y%400==0 || y%4==0) & y%100!=0){
            return "Год високосный";}
             else {
                 return "год невисокосный";

        }
        }




        //5 домашнее задание(Дома)
           public static String currencyExchange(int e,int v)
           {
               if (v == 1){
                   return ("Курс рубля = " + e*60.60);
                }else if (v == 2){
                     return ("Курс венгерского форинта = " + e * 405) ;
                 }else if (v==3) {
                       return ("Курс доллара = " +  e*1);
                  }else {
                         return ("Курс монгольского тугрика = "+e*10);
                   }

           }
           public static String currencyExchange2(double euro,char cur)
           {
               if (cur == 'R'){
                   return ("Курс рубля = " + euro*60.60 );
                }else if (cur == 'F'){
                    return ("Курс венгерского форинта = " + euro * 405) ;
                 }else if (cur == 'D') {
                     return ("Курс доллара = " +  euro*1);
                  }else {
                      return ("Курс монгольского тугрика = "+euro * 10);
                   }

           }

    //3 домашнее задание(Дома)
    public static String weekDay(int b)
    {
        if (b ==1) {
        return "Понедельник";
    }else if (b == 2){
            return "Вторник";
        }else if (b == 3){
            return "Среда";
           }else if (b == 4){
            return "Четверг";
             }else if (b ==5) {
              return "Пятница";
               }else if (b ==6) {
                return "Суббота";
                 }else if (b == 7) {
                  return "Воскресенье";
                  } else {
                   return "Нет совпадений";}


    }

    }

