import java.util.Arrays;
public class ReverseValue {
    public static void main(String[] args){
        int[] my_array1 = {
                2365, 5369, 1256, 3698, 5698,
                3659, 1336, 7594, 1235, 1239,
        };
        System.out.println("Original array : "+Arrays.toString(my_array1));
        for(int i = 0; i < my_array1.length / 2; i++)
        {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(my_array1));
    }
}

