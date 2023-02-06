package Lesson16;

public class bestseller extends literaturebook {
    private double coeff;
    //он расширял литературабук
    //у него было поле дабл коф
    //расшрял калькулейт прайс умножая резуотат из суперкласса на коеф
    public static void hello()
    {
        System.out.println("Hello from Bestseller");
    }
    public bestseller(int id, String title, String author, double price,double coeff) {
        super(id, title, author, price);
        this.coeff=coeff;
    }
    //если цена не меняется не нужен геттер и сеттер
    //если нужен то нужно использовать их

    public double getCoeff() {
        return coeff;
    }

    public void setCoeff(double coeff) {
        this.coeff = coeff;
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice()*getCoeff();
    }


}
