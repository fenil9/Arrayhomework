public class SpecificValue {
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] my_array1 = {
                896, 205, 926, 236, 120,
                420, 865, 642, 237, 759,
                };
        System.out.println(contains(my_array1, 2013));
        System.out.println(contains(my_array1, 2015));
    }
}
