package Main;

import otherClasses.collection;
public class Main {
    public static void main(String[] args) {
        collection c1 = new collection(100,'A',"Hello!",50.75,true); //unbounded type
        c1.printCollection();

        collection<Integer> c2 = new collection<>(100,200,300); //bounded type
        c2.printCollection();
    }
}
