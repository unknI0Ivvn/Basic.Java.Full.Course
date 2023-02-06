package Lesson17.list;

import java.util.Arrays;

public class MyCustomArrayList implements AdvancedArrayList {
    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size = 0; // "ВИДИМЫЙ" для польщователя размера масива
    // int = целая
    // final - нельзя ничего поменять
    // static - она привязана к самому классу
    //private - она видно только внутри класса снаружи она не видна

    public MyCustomArrayList() {
        data = new int[INITIAL_CAPACITY];
    }

    public static void main(String[] args) {
        MyCustomArrayList list = new MyCustomArrayList();
        list.append(1);
        list.append(3);
        // list.set(-5,10);
        // list.set(0,10);
        //list.set(3,10);
        list.print();
        list.delete(1);
        list.print();
        list.insert(1,2);
        list.print();

        int [] a = new int []{11,12,13,14,15,16,17,18,19,20};
        list.append(a);
        list.print();
    }


    @Override
    public void set(int index, int value) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        data[index] = value;

    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return data[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void append(int value) {
        //size
        //data.length
        if (size == data.length)
            increaseCapacity();
        data[size++] = value;
        //size++;

    }

    private void increaseCapacity() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public void append(int[] a) {
//        if (size == data.length)
//            increaseCapacity();
//        //size = 3
//        //a.length = 20
//        //data.length = 4
        for (int i = 0; i < a.length ; i++) {
            append(a[i]);

        }
    }

    @Override
    public void insert(int index, int value) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        if (size == data.length)
            increaseCapacity();
        for (int i = size - 1; i >=index ; i--) {
            data[i+1]=data[i];

        }
        data[index]=value;
        size++;

    }

    @Override
    public void insert(int index, int[] a) {


    }

    @Override
    public void delete(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;


    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(data[i] + "");
        }
        System.out.println();
        System.out.println(Arrays.toString(data));

    }

    @Override
    public boolean containts(int value) {
        for (int i = 0; i < size; i++) {
            if (value == data[i])
                return true;

        }
        return false;
    }
}
