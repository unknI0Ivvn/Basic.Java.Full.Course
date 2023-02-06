package Lesson18Homework.Time;

public class TimeApp {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(2, 50, 40);
        MyTime t2 = new MyTime(1, 45, 30);

        MyTime t3=new MyTime(1,55,45);

//        System.out.println(t1.equals(t2));
//
//        System.out.println(t1);
        t1.substract(t3);
        System.out.println(t1);

    }
}
