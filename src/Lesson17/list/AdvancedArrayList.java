package Lesson17.list;

public interface AdvancedArrayList {
    void set(int index,int value);
    int get(int index);
    int size();
    void append(int value);
    void append(int [] a);
    void insert(int index,int value);
    void insert(int index,int [] a);//TODO
    void delete(int index);
    //void delete(int index,int howMany);//TODO
    boolean containts(int value);
}
