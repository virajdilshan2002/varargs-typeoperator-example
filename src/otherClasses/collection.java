package otherClasses;

import java.util.Arrays;
public class collection<T> {
    T[] args;
    public collection(T... args){
        this.args = args;
    }

    public void printCollection(){
        System.out.println(Arrays.toString(args));
    }
}
