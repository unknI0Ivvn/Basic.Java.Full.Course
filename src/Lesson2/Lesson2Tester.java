package Lesson2;

public class Lesson2Tester {
    public static void main(String[] args) {
        //System.out.println("5+5" + "hello");
        //System.out.println(5+5);
        //System.out.println("5"+5);
        //System.out.println("5+5="+(5+5));
        int counter;//обьявление переменной
        counter = 101;//инициализация
        System.out.println("counter:" + counter);

        int area = 125;// обьявление переменной с инициализацией
        System.out.println("area is:" + area);
        area = area * 2;
        System.out.println("area is:" + area);
        int hex = 0xabc;//префикс 0B
        System.out.println("hex:" + hex);
        int binary = 0B101;//префикс 0B
        System.out.println("binary:" + binary);
        int octal = 0101;//префикс 0
        System.out.println("octal:" + octal);

        int miles = 50_000_000;
        System.out.println("miles:" + miles);

        //методы и названия переменных используется camelCase
        //Английские буквы маленькими
        //numberOfBirds - наименование переменных
        //flyToAfrica() - методы
        //CalculatorReciever - класс
        //тип данных LONG
        //long big = 424241421424124L; // суффикс либо L либо l
        //long anotherLong = 4442424242L;
        //кастинг - ПРИВЕДЕНИЕ ПРОЧИТАТЬ
        long big = 185L;
        long anotherLong = 66L;

        System.out.println("long sum:" + (big + anotherLong + 4000));
        int myBigint = (int) big;
        System.out.println("big:" + big);
        System.out.println("myBigInt:" + myBigint);

        //ЧТО ТАКОЕ МЕТОДЫ
        // public static(ДОСТУП) void(ТИП ВОЗВРАЩАЕМОГО ЗНАЧЕНИЯ) fly (имя) (int - тип параметра height - параметр ) { // to do
        //VOID - значит что метод ничего не возвращает(УЗНАТЬ ЧТО ТАКОЕ ВОЗВРАЩЕНИЕ)
        int height = 44;
        System.out.println("main height:" + height);
        fly();
        run();
    }
        public static void fly()
        {
            int height = 14;
            System.out.println("fly height: "+height);
        }
        public static void run()
        {
            int height = 3;
            System.out.println("run height:" + height);
        }

        }





