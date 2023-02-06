package Lesson18;

import Lesson18.figure.Circle;
import Lesson18.figure.Cylinder;

public class Lesson18 {
    public static void main(String[] args) {
        //Object toString equals

        //Object - встроенный в java класс который
        // является суперклассом для всех классов

        //даже если класс ничего не расширяет
        //фактически он расширяет object

        //toString - позволяет классу распечатать себя как ему нужно
        //equals позволяет сравнить экземпляры классов по значению

        Auto mazda = new Auto("Mazda:",2016,"Black");
        System.out.println(mazda);
//        int [] a = new int[]{1,2,3};
//        int [] b = a;
//        System.out.println(a);
//        System.out.println(b);

        String hello = "";
        hello+=mazda;
        System.out.println(hello);

        Auto[]park = getAutopark();
        System.out.println(contains(park,mazda));
        Circle circle = new Circle();
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(34);
        System.out.println(cylinder);


    }
    public static boolean contains(Auto[] park,Auto a)
    {
        for (int i = 0; i < park.length; i++) {
            //if(park[i]==a) // оператор сравнения адресов
            if(park[i].equals(a))
                return true;

        }
        return false;
    }
    public static Auto[] getAutopark()
    {
        Auto mazda = new Auto("Mazda",2016,"Silver");

        Auto opel = new Auto("Opel",2019,"White");
        Auto bentley = new Auto("Bentley",2010,"Red");
        return new Auto[]{mazda,opel,bentley};
    }
}
