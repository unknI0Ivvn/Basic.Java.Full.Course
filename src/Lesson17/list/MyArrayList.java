package Lesson17.list;

import java.util.Arrays;

public class MyArrayList implements AdvancedArrayList {
    private int[] source;

    public MyArrayList(int initialSize) {
        source = new int[initialSize];
    }

    public MyArrayList(int[] array)
    {
        source=new int[array.length];
        for (int i = 0; i < source.length; i++) {
            source[i]=array[i];

        }
    }
    @Override
    public void set(int index, int value) {
        source[index]=value;

    }

    @Override
    public int get(int index) {
        return source[index];
    }

    @Override
    public int size() {
        return source.length;
    }

    @Override
    public void append(int value) {
        int [] newSource = new int[size()+1];
        for (int i = 0; i <size() ; i++) {
            newSource[i]=source[i];
        }
        newSource[size()]=value;
        source=newSource;
    }

    @Override
    public void append(int[] a) {
        int [] newSource = new int [size()+a.length];
        for (int i = 0; i < size(); i++) {
            newSource[i]=source[i];

        }
        for (int i = 0; i <a.length ; i++) {
            newSource[size()+i]=a[i];


        }
        source=newSource;
    }

    @Override
    public void insert(int index, int value) {
        int [] newSource = new int[size()+1];
        for (int i = 0; i < index; i++) {
            newSource[i]=source[i];


        }
        newSource[index]=value;
        for (int i = index; i <size() ; i++) {
            newSource[i+1]=source[i];

        }
        source=newSource;

    }

    @Override
    public void insert(int index, int[] a) {
        //TODO
    }

    @Override
    public void delete(int index) {
        int [] newSource = new int [size()-1];
        for (int i = 0; i < index; i++) {
            newSource[i]=source[i];
        }
        for (int i = index+1; i <size() ; i++) {
            newSource[i-1]=source[i];

        }
        source=newSource;

    }

    @Override
    public boolean containts(int value) {
        for(int i:source)
            if(i == value)
                return true;
        return false;
    }

    public void print() {
        System.out.println(
                Arrays.toString(source));

    }

    }