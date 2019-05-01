import java.util.ArrayList;

public class ReplaceParticular
{
    public static void main(String[] args)
    {

        ArrayList arrayList = new ArrayList();


        arrayList.add("13");
        arrayList.add("69");
        arrayList.add("24");

        System.out.println("Original ArrayList...");

        for(int index=0; index < arrayList.size(); index++)
            System.out.println(arrayList.get(index));


        arrayList.set(2,"5");


        System.out.println("ArrayList after replacement...");
        for(int index=0; index < arrayList.size(); index++)

            System.out.println(arrayList.get(index));
    }
}

