package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class MyData{
    int value;

    public MyData(int value) {
        this.value = value;
    }

    static MyData create(int v){
        return new MyData(v);
    }

    @Override
    public String toString(){
        return "" + value;
    }

}

public class Main {
    public static void main(String[] args){
        List<MyData> list = new ArrayList<>();
        list.add(MyData.create(1));
        list.add(MyData.create(2));
        list.add(MyData.create(3));

        method1(list);
    }

    static void method1(List<MyData> list){
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
