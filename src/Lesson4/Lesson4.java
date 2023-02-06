package Lesson4;


//char
//String
public class Lesson4 {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'b';

        char c = 99; // таблица UTF - 16
        char euro ='\u20ac'; // таблица UTF - 16
        char dollar ='\u0024'; // таблица UTF - 16

        String name = "Bob";

        System.out.println("a=" +a);
        System.out.println("b=" +b);
        System.out.println("b=" +b);
        System.out.println("euro=" +euro);
        System.out.println("dollar=" +dollar);

        char space = ' ';
        char tab = '\t';
        char newLine = '\n';

        String space1 = " ";
        //char space2= " "; // с чаром только одинарные ковычки ' '


        String firstName = "Max";
        String lastName = "Macron";
        int age = 38;
        System.out.println(firstName+lastName+age);
        System.out.println(firstName+space+lastName+space+age);
        System.out.println(firstName+tab+lastName+tab+age);
        System.out.println(firstName+newLine+lastName+newLine+age);
        System.out.println(firstName+space1+lastName+space1+age);
        String london = "London is a capital of Great Britain";
        System.out.println(london.length());
        System.out.println(london.isEmpty());
        String capital = london.substring(0,6);
        System.out.println(capital);
        System.out.println(london.substring(10));
        System.out.println(london.toUpperCase());
        String data = "123456";

        int value = Integer.parseInt(data) ; // преобразование строки в интежер
        System.out.println(value+44);
        int ddd = Integer.parseInt("14 let".substring(0,2));
        System.out.println(
                Integer.parseInt(
                        "14 let".substring(0,2)
                )


        );

        System.out.println(0+'A');


    }

}
