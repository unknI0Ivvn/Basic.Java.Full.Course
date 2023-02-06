package Lesson5;

public class Lesson5Comparison {
    public static void main(String[] args) {
        System.out.println(analyzeSaunaTemp(15));

        //операторы сравнения
        // < <= < >= != ==
        //ture / false

        int i = 2;
        System.out.println("i == 2" + (i==2));
        System.out.println("i = 2" + (i=2));

        System.out.println(isDevidedby7(49));
        System.out.println(isDevidedby7(50));

        System.out.println(64%3);
        //условный оператор if else if else
        int balance = -4;
        if(balance > 0)
        {
            System.out.println("Balance"+ balance + " is Positive");
        } else if (balance == 0)
        {
            System.out.println("Balance"+balance + " is not Positive");
        }
        /*
        if (условие )
        {
        выполняется только если условие = true
         }
         else if (условие2)
         {
         выполняется если условие 1 = false и условие 2 = false
         }
         else if (условие n)
         {}
         ....
         else
         {
         выполеяет если условие = false
         }
        */
        System.out.println("Compare 3 and 13 : "+compareTwoNumber(3,13));
        System.out.println("Compare 3 and 13 : "+compareTwoNumber(5,5));
        //функция которая принимает на вход число и возвращает тру если это
        // чисто делится без остатка и на 5 и на 7

        System.out.println("is 49 divded by 5 and 7:" + isDevidedby5and7(49));
        System.out.println("is 140 divded by 5 and 7:" + isDevidedby5and7(140));
        int age = 33;
        int income = 30_000;
        if(age > 30&& income >25000)
        {
            System.out.println("Даем кредит");
        }

    }
    public static boolean isDevidedby5and7(double number)
    {           //boolean     boolean
        return (number%5==0)&(number%7==0);

    }
    public static int compareTwoNumber (int a,int b)
    {
        if (a>b)
        {
            return a;
        }
        else {
            return b;

        }
    }
    public static boolean isDevidedby7(int number)
    {
        int remain = number % 7;
        return remain == 0;
    }

    public static String analyzeSaunaTemp(int t)
    {
        // >80 Супер горячо
        //>60 Замечательно
        //>40 Терпимо
        //Не сауна
        if (t > 80)
        {
            return "супер горячо";
        }
        else if(t > 60)
        {
            return "замечательно";
        }
        else if(t > 40)
        {
            return "терпимо";
        }
        else
        {
            return "не сауна";
        }
    }
}
