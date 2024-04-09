import java.util.Scanner;
//number divided by 3 and 5
public class Divided_by_3_and_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size number");
        int array_size = scanner.nextInt();
        //declare an array
        int arr[] = new int[array_size];
        System.out.println("Enter an array values between 1 to 100 ");
        //input array values
        for (int i = 0; i < array_size; i++) {
            arr[i] = scanner.nextInt();
        }
        //print number divided by 3
        System.out.println("Number divided by 3: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
        //print number divided by 5
        System.out.println("Number divided by 5: ");
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 5 == 0) {
                System.out.println(arr[j]);
            }
        }
    }
}