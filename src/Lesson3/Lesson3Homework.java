package Lesson3;
import java.lang.Math;
public class Lesson3Homework {
    public static void main(String[] args) {


        //Домащнее задание 1/написать функцию вычисления площади эллипса
        //Первый способ
        int a = 5;
        int b = 7;
        final double pi = 3.14;
        double squareEllipse = a * b * pi;
        System.out.println("The Square of Ellipse : = " + squareEllipse);
        System.out.println(ellipsearea(11,12.4));
        System.out.println(squareLength(10));
        System.out.println(calculate5YearsYield(1250,3.5,5));
        System.out.println(calculate5YearsYield(1250,3.5,15));
        System.out.println(calculate5YearsYield(1250,3.5,20));

        //Домашнее задание 2/Написать функцию для вычисления окружности
        //Первый способ
        int R = 5;
        double squareCirle = 2*pi*R;
        System.out.println("The Square of Circle : =" + squareCirle);
        SquareCir(2,3.14);
        System.out.println("The Square of Circle:=" + SquareCir(2,pi));
        //Домашнее задание 3/Клиент положил в банк 1250 евро под 3 5 процента сколько будет через 5 лет с учетом сложных процентов
        int generalSum = 1250;
        double procents = 3.5;
        int amountOfYears = 5;
        double firstprofit = generalSum/100*procents; // 45 профит + 1250
        double firstYearSum = generalSum + firstprofit;
        double secondprofit = firstYearSum/100*procents;// здесь нужно профит и первоначальную ссуму сложить от первого года
        double secondYearSum = firstprofit+secondprofit;
        double thirdprofit = (secondYearSum/100*procents);
        double thirdYearSum = secondprofit+thirdprofit;
        double fourthprofit = (thirdYearSum/100*procents);
        double fourthYearSum = thirdYearSum+firstprofit;
        double fifthprofit= (fourthYearSum/100*procents);
        double fifthYearSum = fourthprofit+fifthprofit;
        double summa = firstYearSum+secondYearSum+thirdYearSum+fifthYearSum+fourthYearSum;
        System.out.println("Client recieved: = " + summa);
        //Второй способ подумать под упрощением

        double firstyearsumm = generalSum%procents + generalSum;
        double sum = firstyearsumm * amountOfYears*procents/100 + generalSum;
        System.out.println("Client recieved: =" + sum );



//Второй способ первой задачи ! Непонятно почему нужно дублировать переменные
        SquareEllips(5, 5, 3.14);
        System.out.println("The Square of Ellipse : = " + SquareEllips(5,5,pi));
    }
    //            тип                  параметр
    public static double SquareEllips(int a, int b, double pi)

    {
        double Square = a*b*pi;
        return Square;

    }
    public static double ellipsearea(double a,double b)
    {
        final double pi = 3.14;
        return a*b*pi;
    }
    public static double squareLength(double radii)
    {
        return 2*Math.PI*radii;
    }
    //Второй способ,второй задачи
    public static double SquareCir(int R,double pi)
    {
        double SquareC = 2*pi*R;
        return SquareC;
    }

    //3.Homework
    public static double calculate5YearsYield(double initialSum,double bankPercent,int years)
    {
        double p = bankPercent/100+1;
        return initialSum*Math.pow(p,years);
        //return initialSum*p*p*p*p*p;
    }

}

