public class IndexElement {
    public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] my_array = {12, 14, 24, 33, 63, 90, 88, 85,};
        System.out.println("Index position of 24 is: " + findIndex(my_array, 24));
        System.out.println("Index position of 85 is: " + findIndex(my_array, 85));
    }
}
