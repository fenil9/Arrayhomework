public class CountTotal
{
    public static void main(String[] args) {
        String string = "The best of both worlds";
        int a = 0;
        int count = 0;

        //Counts each character except space    
        for(int i = 0; a < string.length(); i++) {
            if(string.charAt(a) != ' ')
                count++;
        }

        System.out.println("Total number of characters in a string: " + count);
    }
}

