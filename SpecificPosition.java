import java.util.Arrays;
public class SpecificPosition  {

    public static void main(String[] args) {

        int[] my_array = {18, 19, 29, 39, 49, 59, 69,};

        // Insert an element in 3rd position of the array (index->2, value->5)

        int Index_position = 4;
        int newValue    = 22;

        System.out.println("Original Array : "+Arrays.toString(my_array));

        for(int i=my_array.length-1; i > Index_position; i--){
            my_array[i] = my_array[i-1];
        }
        my_array[Index_position] = newValue;
        System.out.println("New Array: "+Arrays.toString(my_array));
    }
}


