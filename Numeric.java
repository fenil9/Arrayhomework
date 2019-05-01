import java.util.Arrays;
public class Numeric {
    public static void main(String[] args){

        int[] my_array1 = {
                100, 150, 250, 360, 300,
                450, 325, 651, -222, 886,
                };


        System.out.println("Original numeric array : "+Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));


    }
}
