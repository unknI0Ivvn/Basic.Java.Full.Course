package Lesson19;

import Lesson18.Auto;

import java.util.Arrays;

public class Lesson19 {
    public static void main(String[] args) {
        Auto mazda = new Auto("Mazda:", 2016, "Black");
        swapAuto(mazda);
        System.out.println(mazda);

        //String
        //фактически он представляет собой масив char
        //final - от него нельзя пронаследоваться
        //immutable - нет возможности поменять его состояние

        String s1 = "Hello World";
        String s2 = "Hello World";
        //кеш строк

        System.out.println(s1 == s2);

        String s3 = new String(new char[]{'H', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'});
        String s4 = new String("Hello World"); // создается новый экземпляр

        System.out.println(s3 == s1);//false
        System.out.println(s3 == s4);//false

        System.out.println(s3.equals(s1));//true

        char a = 'a';
        System.out.println(a); // a
        System.out.println(a + 0);

        //charAt - > char
        System.out.println(s4.charAt(0));//H
        //concat - > String
        System.out.println(s4.concat(s3).concat(s2).concat(s1)); // Hello world Hello World
        System.out.println(s4 + s3);         //Hello world Hello world

        //contains -> boolean
        System.out.println(s1.contains("ell")); //- позволяет узнать содержаться ли кусок строки в строке

        // startsWith endsWith -> boolean - позволяет узнать начинается какая то строка с какойто подстроки
        System.out.println(s1.startsWith("Hell"));//true
        //если возомдность сравнивать строки между с собой с помощтю контаинс виз contains with

        System.out.println("hello".equalsIgnoreCase("Hello")); // true
        //indexOf - > int Hello World  // позволяет определить с какого индеккса гначинается запрашиваемый кусок строки
        System.out.println(s1.indexOf("wo"));//6

        System.out.println(s1.indexOf("l", 7));//9 fromIndex 9 начиная с какой позии искать
        // есть такой же споосб ктооррый наичнаетс искать влево // от 6 начал поиск влево
        System.out.println(s1.lastIndexOf("l", 6));

        //length - > int показывает длину строки
        System.out.println(s1.length());//11
        //split -> String[] возрващает массив сток(разбивает строку по шаблону)
        System.out.println(Arrays.toString(
                        s1.split("")//[HELLO WORLD]
                )
        );
        System.out.println(Arrays.toString(
                        s1.split("[er]")//[HELLO WORLD]
                )
        );
        //toCharArray - > char[]
        System.out.println(Arrays.toString(s1.toCharArray()));
        //toUpperCase to LowerCase - > String
        System.out.println(s1.toUpperCase());//HELLO WORLD
        //substring - возвращает строку обратно
        //012345678
        //Hello World
        System.out.println(s1.substring(3, 7));// 7 не включительно - "// lo w"
        //32 bit
        //64 long
        //2billions 2 v 32 stepeni kolichestrvochar v stroke

        //replace - > String
        System.out.println(s1.replace("World","WORLD"));//Hello WORLD
        //replaceALL -> String

        System.out.println(reverse("Hello"));
        System.out.println(reverse1("WHATS UP"));
    }//конец мейн

    //напишите функцию которая принимает на вход строку и возвращает переверную строку
    public static String reverse(String s) {
        char[] array = s.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];

        }
        return result;

    }

    public static String reverse1(String s)
    {
        String r = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            r+=s.charAt(i);

        }
        return r;

    }

    public static String reverse2(String s)
    {
        char [] r = new char[s.length()];
        for (int i = s.length()-1; i >=0 ; i--) {
            r[s.length()-i-1]=s.charAt(i);

        }
        return new String(r);
    }

    public static void swapAuto(Auto a)
    {
//        Auto fiat = new Auto("Fiat",2021,"White");
//        a = fiat;
        a.setMaker("Rolls-Royce");
    }
}
