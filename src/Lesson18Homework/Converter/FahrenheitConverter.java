package Lesson18Homework.Converter;

public class FahrenheitConverter implements Converter {
    private double temp;

    public FahrenheitConverter(double temp) {
        this.temp = temp;

    }
    @Override
    public double convert()
    {
        return temp*9/5+32;
    }
}
