import java.util.Scanner;

public class String_and_Count_FindA {
    // Write enter any string and count total num of 'a' using do-while loop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write any string");
        String sent = scanner.nextLine();
         int count = 0;
         int i = 0;
        // do-while loop to count 'a' characters
         do
         {
             if (sent.charAt(i) == 'a')
             {
                 count++;
             }
             i++;
         }
         while (i < sent.length());
        //Print the total number of 'a' in the given string
         System.out.println("The total number of 'a' in the string is: " +count);
    }
}
