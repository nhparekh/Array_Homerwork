import java.util.Scanner;

public class Armstrong_Number {
    // wap to find out armstrong number

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num");
        int num = scanner.nextInt();
       int orig_num, remainder, result = 0;
       //stored in another number
        orig_num = num;
       while (orig_num != 0) {
           remainder = orig_num % 10;
           //remainder is powered by 3 (number of digits) and added to result
           result += Math.pow(remainder, 3);
           orig_num /= 10;
       }
       if (result == num)
           System.out.println(num+ " is an Armstrong number");
       else
           System.out.println(num+ " is not an Armstrong number");
        }

}
