package Lesson16;


//абстрактый класс - это класс у которого есть состояние и часть методов
//один или несколько методов его обьяевлены абстрактными и не содержат реализации
//Эти методы требуется реализовать в дочерних классы
// Создать экземпляр абстрактного класса нельзя
abstract public class book {
    private int id;
    private String title;
    private String author;
    private double price;

    public abstract boolean isAlibris();

    public book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculatePrice()
    {
        return getPrice();
    }
}
