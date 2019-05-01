import java.util.ArrayList;
import java.util.Collections;
public class CloneList {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Laptop");
        c1.add("Mouse");
        c1.add("keyboard");
        c1.add("screen");
        c1.add("speaker");

        System.out.println("Original array list: " + c1);

        ArrayList<String> newc1 = (ArrayList<String>)c1.clone();

        System.out.println("Cloned array list: " + newc1);
    }
}
