package Lesson5;

public class Lesson5 {
    public static void main(String[] args) {

        System.out.println(sum(1,3,4));
        System.out.println(Math.pow(12,2));
        long a = (long) 6.89;
        System.out.println(a);
        //логический тип данных boolean true false
        boolean isSunny = true; //false
        // Логические операции
        // & - и and
        // | - или or
        // ! - не not
        // ˆ - логическое или xor
        // &
        System.out.println("__________________");
        System.out.println(true&true); // true
        System.out.println(true&false); // false
        System.out.println(false&false);// false
        System.out.println("__________________");
        // | или
        System.out.println(true|true); // true
        System.out.println(true|false); // true
        System.out.println(false|false);// false
        System.out.println("__________________");
        // ! - не
        System.out.println(!true); // false
        System.out.println(!false); //true
        // ˆ - логическое или
        //.....
        System.out.println("__________________");
        System.out.println(false&false&true); // false
        System.out.println((false|true)&true);//true
        System.out.println("__________________");


    }
    public static double sum(double a,double b,double c)
    {
        return  a+b+c;
    }
}
