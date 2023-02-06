package Lesson18Homework.Time;

//Напишите класс MyTime в которому будут часы, минуты и секунды.
// Напишите конструктор и геттеры. Напишите операцию сравнения, toString,
// и добавления и вычитания для MyTime. Пример: MyTime(2,3,1) - MyTime(1, 1,1) -> MyTime(1, 2, 0)
public class MyTime {
    private int h;
    private int m;
    private int s;

    @Override
    public String toString() {
        return "MyTime{" +
                "h=" + h +
                ", m=" + m +
                ", s=" + s +
                '}';
    }

    @Override
    public boolean equals(Object t) {
        if (!(t instanceof MyTime))
            return false;

        return h == ((MyTime) t).h && m == ((MyTime) t).m && s == ((MyTime) t).s;
    }

    public MyTime(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    public void add(MyTime t) {
        //50c+50c = 1 min : 40 sec
        int secs = s + t.s;// 40 + 40 = 1m + 20 s
        int mins = secs / 60;
        secs = secs % 60;
        mins += m;
        mins += t.m;
        int hours = mins / 60 + h + t.h;
        mins %= 60;
        s = secs;
        m = mins;
        h = hours;


    }

    public void substract(MyTime t) {
        int secs = s - t.s;// 40 + 40 = 1m + 20 s
        int mins = m-t.m;
        if(secs<0){
            secs=60-secs;
            mins--;
        }
        int hours = h-t.h;
        if(mins<0)
        {
            mins=60+mins;
            hours--;
        }
//        if(hours<0)
//            throw new IllegalArgumentException("Time cant be negative");
        s = secs;
        m = mins;
        h = hours;


    }

}
