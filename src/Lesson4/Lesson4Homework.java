package Lesson4;

public class Lesson4Homework {
    public static void main(String[] args) {

        //1.Найдите и выведите на экран символы рубля и какой-нибудь из знаков зодиака на выбор (UTF-16)


//2.Напишите функцию которая принимает на вход три параметра - имя, фамилию и возраст и выводит их на экран каждый в отдельной строке.
        String firstName = "Ilia ";
        String lastName = "Rogozhnikov";
        String age = "26";
        char newLine = '\n';
        System.out.println(firstName + newLine + lastName + newLine + age);
        char rouble = 0x20BD;
        System.out.println("rouble"+rouble);

        //3.Вырезать из строки "Вход запрещен" второе слово и заменить его на "разрешен".
        String exitDenied = "Вход запрещен";
        System.out.println(exitDenied);
        System.out.println(exitDenied.substring(5, 13));
        String exitAllowed = "Разрешен";
        //Посмотреть в интернете функции строки
        // 4.Напишите функцию которая принимает на вход строку и возвращает ее (return) в верхнем регистре.(

      /*
       String Name = "dsds";



    }
    public static String Name(String Why);

    {
        return Name.toUpperCase();
    }

       */

        // разобраться
        // 5* Напишите функцию которая принимает на вход строку и символ и возвращает (return) строку, состоящую из: символ+строка+символ.
        /*
        char euro = '\u20ac';
        String Money = "Gold";
        int value = Integer.parseInt(Money);
        int valuee =Integer.parseInt(euro);
        enterParametr();

enterParametr();
    }

        public static int enterParametr(int value ,int valuee);
        {
            return enterParametr();
        }


//подумать !!!! и посмтореть интернет

*/
        System.out.println("Четное 8 " + isEven(8));
        System.out.println("Нечетное 8 " + isEven(11));
        printUser("Ilia","Rogozhnikov", 26);
        String entryDenied = "Вход запрещен";
        String entryAllowed = entryDenied.substring(0,5) + "Разрешен";
        System.out.println(entryAllowed);
        System.out.println(capitalize(" привет"));
        System.out.println(greeting("Hello", 'F'));
        }
public static String greeting(String string,char c)
{
    return c + string + c;
}
    public static String capitalize(String text)
    {
        return text.toUpperCase();
    }

public static void printUser(String firstName,String lastName,int age)
{
    final char newLine = '\n';
    System.out.println(firstName+newLine+lastName+newLine+age);
}

    public static int isEven (int number)
    {
        return number % 2;}

}

