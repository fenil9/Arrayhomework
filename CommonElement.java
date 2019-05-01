import java.util.*;
public class CommonElement  {
    public static void main(String[] args)
    {
        String[] array1 = {"design", "multi", "current", "physics", "maths", "science"};

        String[] array2 = {"science", "chemestry", "english", "history", "geography", "JAVA"};

        System.out.println("Array1 : "+Arrays.toString(array1));
        System.out.println("Array2 : "+Arrays.toString(array2));

        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    set.add(array1[i]);
                }
            }
        }
    }
}



