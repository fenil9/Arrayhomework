public class SumValues {
    public static void main(String[] args) {
        int my_array[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}
