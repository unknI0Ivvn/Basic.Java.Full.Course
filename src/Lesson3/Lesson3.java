package Lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;

        squaretriangle(5,6);
        System.out.println("Square triangle is :" + squaretriangle(5,7));
        System.out.println("a:" + a);//6

        a = a / 3;
        System.out.println("a:" + a);//2
        --a; // от предыдушего значения вычетается один
        System.out.println("a:" + a);//1
        //a = a + 15;
        a += 15; // добавление к предыдушему значению мат операция
        System.out.println("a:" + a);
        doubleB(b);
        System.out.println("b:"+b);
        float angle = 45.6333F;
        double height = 54.666; // дабл в 2 раза длинее
        double foundationArea = 44.55;
        double volume = height * foundationArea;
        System.out.println("Volume is :"+ volume);
        int intVolume = (int ) volume;
        System.out.println("ïntVolume is:"+intVolume);
        //Обьявление константы
        final double pi = 3.14; // делаем константу неизменной
        //pi = 5;

    }
        public static void doubleB(int b)
        {
            b=b*2;
            System.out.println("b:"+b);
        }

        public static int squaretriangle(int a,int b)
        {
            int area = a*b;
            return area;
        }


    }

