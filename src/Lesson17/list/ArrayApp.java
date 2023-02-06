package Lesson17.list;

public class ArrayApp {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(3);
        list.set(0,0);
        list.set(1,1);
        list.set(2,2);
        list.print();
        list.append(4);
        list.print();
        System.out.println(list.containts(2));
        list.insert(2,22);
        list.print();
        list.delete(2);
        list.print();

        list.append(new int[]{5,6,7});
        list.print();
    }
}
