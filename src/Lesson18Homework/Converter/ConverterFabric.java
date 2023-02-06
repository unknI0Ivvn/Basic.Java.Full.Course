package Lesson18Homework.Converter;

public class ConverterFabric {
    public Converter getConverter(char converter,double temp)
    {
        switch(converter)
        {
            case 'F':
                return new FahrenheitConverter(temp);
            case 'K':
                return new KelvinConverter(temp);
            default:
                return new CelsiusConverter(temp);
        }
    }
}
