package Lesson16;

public class App {
    public static void main(String[] args) {
       // book Book = new book(1,"Малая Земля","Брежнев",12.33);
        literaturebook harrypotter = new literaturebook(2,"Гарри Поттер","Роулинг",33.12);
        bestseller jaws = new bestseller(3,"Jaws","Saimak",15,1.2);
        //describeBook(jaws);

        book [] Books={ /*Book*/harrypotter,jaws};

        harrypotter.hello();
        jaws.hello();

        literaturebook j = jaws;
        j.hello(); // j - Bestseller
        literaturebook.hello();
        book Book = harrypotter;
        for (book b:Books)
        {
            describeBook(b);
        }

        //Полиморфизм - возможность вызвать один и тот же метод у обьектов производных классов
        //по ссылке на базовый класс

    }
    public static void describeBook(book Book)
    {
        System.out.println("id: "+
                Book.getId()+
                " author: "+
                Book.getAuthor()+
                " price: "+
                Book.calculatePrice());
    }
    int [] a = new int[]{1,3,4};
    MyArrayList list = new MyArrayList(a);
}
