public class Equality {
    static void  equality_checking_two_arrays(int[] my_array1, int[] my_array2)
    {
        boolean  equalOrNot = true;

        if(my_array1.length == my_array2.length)
        {
            for (int i  = 0; i < my_array1.length; i++)
            {
                if(my_array1[i] != my_array2[i])
                {
                    equalOrNot = false;
                }
            }
        }
        else
        {
            equalOrNot  = false;
        }

        if  (equalOrNot)
        {
            System.out.println("Two arrays are equal.");
        }
        else
        {
            System.out.println("Two  arrays are not equal.");
        }
    }

    public static void  main(String[] args)
    {
        int[] array1 =  {9, 8, 7, 6, 5};
        int[] array2 =  {9, 8, 7, 6, 5};
        int[] array3 =  {9, 8, 7, 6, 5};

        equality_checking_two_arrays(array1,  array2);
        equality_checking_two_arrays(array1, array3);
    }
}

