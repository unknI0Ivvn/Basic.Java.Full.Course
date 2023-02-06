package Lesson13;

public class Lesson13Work {
    //КЛАССЫ
    //Класс - обьединение чего-либо по характерным признакам
    //своего рода шаблон для описания своих представителей
    //КЛасс служит для инкапсуляции размещении организации кода полей и методов
    //связанных друг с другом в одном классе
    //Есть возмоджность скрыть поля и методы от вызовы из вне изза пределов класса или пакета

    public static void main(String[] args) {
        int [] a = new int[]{1,2,3};
        Lesson13WorkClassHuman vasya = new Lesson13WorkClassHuman("Vasha","Rabvk",21);

        //Human() - construcctor
        a[0] = 10;
        vasya.name="Vasya";
        vasya.lastname = "Samokhvalov";
        vasya.age=27;

        vasya.introduce();

        Lesson13WorkClassHuman petya = new Lesson13WorkClassHuman("Ilia","Rogozhnikov",25);
        /*
        petya.lastname = "Rogozhnikov"
        petya.name="Ilia";
        petya.age = 21;
         */
        petya.introduce();
        vasya.introduce();
    }
}
class Lesson13WorkClassHuman {
    String name;
    String lastname;
    int age;
    Lesson13WorkClassHuman(String f,String l,int a) // когда нет конструктора ява создает безпараметрический
    {
        //КОГДА МЫ САМИ СОЗДАЕМ КОНСТУРКТОР ЧТОБЫ ПРОНИЦИАЛИЗИРОВАТЬ ПОЛЯ КЛАССА
        //ЗНАЧЕНИЯМИ ПО УМОЛЧАНИЯМИ ИНИЦИАЛИЗЦАИЯ ПРОХодИЛА
        name = f;
        lastname=l;
        age = a;
        //для использования без отдельных строк инициальизаций
    }
    void introduce()
    {
        System.out.println("My name is"+name+""+lastname+" I am "+age+" years old");
    }
}
