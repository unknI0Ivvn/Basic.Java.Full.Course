package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Hello \nworld!\n"); // односрочный комменатрий
        System.out.println("Hello world");
        sayHello(); // вызов метода
        calculateArea();

    }
    public static void sayHello()
    {
        System.out.println("My town is Berlin");

    }
    public static void calculateArea()
    {
        System.out.println("area: "+ 10*20);
    }
//Типы данных
    // целочисленные byte 8b short 16b int 32b long 64b
    // с плавающей точкой меньше данных хранит float double
    // boolean true false
    // char хранит только один символ
    // string хранит много символов
}
