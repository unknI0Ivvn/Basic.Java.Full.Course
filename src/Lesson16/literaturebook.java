package Lesson16;
//этот класс наследовал бук
//в калькулейтпрайс добавляться к цене книги 10
//Наследование
//extends
//в Java только одинарное наследование
// можно переопределять методы из родительского класса при этом
//реализация родительских методов доступна через super
//статические методы не могут переопределяться
public class literaturebook extends book{
    public static void hello()
    {
        System.out.println("Hello from Literaturebook");
    }


    @Override
    public boolean isAlibris() {
        return false;
    }

    public literaturebook(int id, String title, String author, double price) {
        super(id, title, author, price);
    }
    @Override
    public double calculatePrice() {
        return super.calculatePrice()+10;
    }
    //этот класс наследовал бук
    //в computerPrice() добавляться к цене книни 10

}
