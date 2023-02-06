package Lesson7;

public class Lesson7HomeWorkComplete {
    public static void main(String[] args) {
        getInterval(2,10,2);
        System.out.println("Сумма переменных интервала: "+getIntervalSumm(2,10,2));
        getQuantities(100);
        System.out.println("Количество денег : " + CalkPerc(1000,1,10));
        System.out.println(getFactorial(4));
        //Напишите функцию для расчета "сложных" процентов - должна принимать на вход сумму,
        // процент и количество лет.
        // Должна возвращать сумму по окончании вклада.
    }
    //Первая домашняя работа.Подпункт №1.
    public static void getInterval(int a,int b,int c)
    {
        for(int i= a;i<=b;i+=c)
        {
            System.out.println(i);
        }
    }
    //Первая домашняя работа.Подпункт №2
    public static int getIntervalSumm(int a,int b,int c)
    {
        int Summa = 0;
        for(int i =a;i<=b;i+=c)
        {
            Summa+=i;
        }
        return Summa;
    }
    //Первая домашняя работа.Подпункт №3
    public static void getQuantities(int A)
        {
        for(int i = 1;i<=A; i++)
        {
            if (i % 5 == 0 || i % 7 == 0 || i % 13 == 0)
            {
                System.out.println(i);
            }
        }
        }
        //Домашняя работа №2
        public static double CalkPerc(double money,double percent,int years)
        {
            for(int i = 0; i<years; i++)
            {
                money = money * (percent/100+1);
            }
            return money;
        }
        //Домашняя работа №3
        public static double getFactorial(int a)

        {
         int result = 1;
        for (int i = 1; i <= a; i++)
         {
         result *= i;
         }
        return result;
        }


    }

