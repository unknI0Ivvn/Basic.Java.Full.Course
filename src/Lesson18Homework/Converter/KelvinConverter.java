package Lesson18Homework.Converter;

public class KelvinConverter implements Converter {
    private double temp;

    public KelvinConverter(double temp) {
        this.temp = temp;
    }
    @Override
    public double convert(){
        return temp+273;
    }
}
