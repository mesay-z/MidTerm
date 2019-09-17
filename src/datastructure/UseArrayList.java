package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {
    /*
     * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
     * Use For Each loop and while loop with Iterator to retrieve data.
     * Store all the sorted data into one of the databases.
     *
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("jordan");
        arrayList.add("mesi");
        arrayList.add("tiger");

        //using for loop
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println(" ");

        //using Iterator
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}



