import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
    /**
     * @param args
     */
    public static void main(String []args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nice");
        list.add("Bhawanipatna");
        list.add("Kalahandi");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        }
    }