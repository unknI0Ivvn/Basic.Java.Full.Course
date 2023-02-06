package Lesson18Homework.Converter;

public class ConverterApp {
    public static void main(String[] args) {


//        Converter celsius = new CelsiusConverter(25);
//        System.out.println(celsius.convert());
//
//        Converter kelvin = new KelvinConverter(25);
//        System.out.println(kelvin.convert());
//
//        Converter fahrenheitConverter = new FahrenheitConverter(25);
//        System.out.println(fahrenheitConverter.convert());

        ConverterFabric fabric = new ConverterFabric();
        Converter c2f = fabric.getConverter('F',30);
        System.out.println(c2f.convert());

    }
}
