package Lesson18;

public class Auto extends Object {
    private String maker;
    private int year;
    private String color;

    public Auto(String maker, int year, String color) {
        this.maker = maker;
        this.year = year;
        this.color = color;
    }

    public void setMaker(String maker){
        this.maker=maker;
    }

    public String getMaker() {
        return maker;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "" + maker + "" + year + "" + color;
    }

    public boolean equals(Object o) // эквивалентность по содержанию
    {
        if (!(o instanceof Auto))
            return false;
        Auto a = (Auto) o;
//        if (getYear() == a.getYear() && getMaker().equals(a.getMaker()) && getColor().equals(a.getColor()))
//        return true;
//        else
//        return false;
        return getYear()  == a.getYear() && getMaker().equals(a.getMaker()) && getColor().equals(a.getColor());
    }

}
