import java.util.Arrays;
public class DuplicateValue  {
    public static void main(String[] args)
    {
        int[] my_array = {3, 2, 2, 8, 4, 9, 7, 7};

        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
    }
}

