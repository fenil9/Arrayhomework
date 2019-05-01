import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PresentList
{
    public static void main(String[] args)
    {
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("1", "3", "5", "7", "9"));

        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("1", "3", "5", "7", "11"));

        Collections.sort(listOne);
        Collections.sort(listTwo);



        boolean isEqual = listOne.equals(listTwo);
        System.out.println(isEqual);



        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("1", "3", "5", "7", "9"));

        isEqual = listOne.equals(listThree);
        System.out.println(isEqual);
    }
}

