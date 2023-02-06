package Lesson14;

public class Lesson14 {
    //Статические переменный и методы класса описывают класс а не какой-то
    //конкретный обьект этого класса
    //Таким образом статические переменный и методы принадлежат классу в целом
    //а не какому-то конкретному обьекту(экземпляр,instance).
    //обьект == экземпляр == instance

    public static void main(String[] args) {
        /*
        Homosapiens katya = new Homosapiens("Kayta", "Ivanova", 30);
        katya.introduce();
        //Homosapiens.introduce();
        System.out.println(Homosapiens.numberOfHumans);
        Homosapiens vasya = new Homosapiens("Max", "", 30);
        vasya.lastName = "Pivovarov";

        System.out.println(vasya.getLastName()); // cоздание геттера для приавтного поля какое то определнное
        vasya.introduce();
        vasya.setLastName("Petrov");
        Homosapiens max = new Homosapiens("Max", "Bachurin", 35);
        max.introduce();
        System.out.println(Homosapiens.numberOfHumans);
        System.out.println(Homosapiens.averageAge);

         */
        Homosapiens Sam = new Homosapiens("Sam", "Smith", 32);
        Homosapiens Dick = new Homosapiens("Robert", "Siemens", 28);



        Sam.die();
        Sam.introduce();
        Dick.die();

        System.out.println("Average age:" + Homosapiens.averageAge);
        System.out.println("Number of:" + Homosapiens.numberOfHumans);
        Sam.die();
        System.out.println("Average age:" + Homosapiens.averageAge);
        System.out.println("Number of:" + Homosapiens.numberOfHumans);


    }

    Homosapiens max = new Homosapiens();
}


class Homosapiens {
    public static int numberOfHumans = 0;
    public static double averageAge = 0;
    public boolean isAlive = true;
    private String lastName;

    String firstName;

    int age;

    public void die() {
        if (isAlive) {
            isAlive = false;
        }
        if (numberOfHumans == 1) {
            numberOfHumans = 0;
            averageAge = 0;
        } else
            averageAge = (numberOfHumans * averageAge - age) / --numberOfHumans;
    }

    public String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Homosapiens() {

        // command slash
        this("", "", 0);
    }

    public Homosapiens(String firstName, String lastName) {
        this(firstName, lastName, 0);

    }

    public Homosapiens(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        averageAge = (averageAge * numberOfHumans + age) / ++numberOfHumans;
    }


    public void introduce() {
        if(isAlive)
        System.out.println("My name is " + firstName + "" + lastName + ".I am " + age + "years old");
        else
            System.out.println("RIP");
    }
}

