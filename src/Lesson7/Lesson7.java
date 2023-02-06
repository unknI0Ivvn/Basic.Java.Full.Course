package Lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        //break
        //множественное условие в цикле

        //найти из диапазона 1 до 1000 первое число которое делится на
        // и на 5 и на 7 и на 13
        /*
        int i = 1;
        int alreadyFound = 0;
        while(i<1000)
        {
            if (i % 5 == 0 && i%7==0 && i%13==0){
                if (alreadyFound==1)
                System.out.println(i);
                alreadyFound++;
                if (alreadyFound == 2)
                break; // брейк позволяет выйти из одного цикла !!! УСЛОВИЕ СТОИТ ПЕРВОЕ ЧИСЛО ЧТОБЫ ДАЛЬШЕ НЕ ЧИТАЛ
            }
            i++;
        }
        */

        int i = 0;
        do{
            System.out.println("while "+i);
            i++;
        }while (i <=5); // do while для одинарного использования

        for (int j =1;j<=5; j++){
            System.out.println("for"+j);
        }

        //  for(операция1(выполняется только при входе в цикл); условие; операция2)
        //напишите на фор цикл печатаббший числа с 10 до 2 с шагом - 2
         //switch
        //в кейс для свитч можно использовать только конкретные знгачения
        int m = 7;
        String result = "";
        switch (m)//int long boolean String enum
        {
            case 3:
                //System.out.println("three") ;
                result = "three";
                break;
            case 2:
                //System.out.println("two");
                result = "two";
                //break
            case 1:
                //System.out.println("one");
                result = "one";
                break;
            default: // как else в if
                //System.out.println("Unknown number");
                result = "unknown number";
        }
        System.out.println(result);

        int weekDay = 5;
        switch (weekDay)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("work day ");
                break;
            case 6:
                System.out.println("Satruday ");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
        }
        

       int sum = 0;


        for (int j = 10;j>=2;j-=2){
            sum +=j;
            System.out.println("for"+j);
        }
        System.out.println("sum"+sum);

        }
    }

