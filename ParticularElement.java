import java.util.ArrayList;
import java.util.Arrays;

public class ParticularElement
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("william", "james", "logan", "mason"));

        String firstName = list.get(0);         //williams
        String secondName = list.get(1);        //mason

        System.out.println(firstName);
        System.out.println(secondName);
    }
}
