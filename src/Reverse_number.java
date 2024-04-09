import java.util.Scanner;
//reverse number
public class Reverse_number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size number");
        int array_size = scanner.nextInt();
        //declare an array
        int arr[] = new int[array_size];
        System.out.println("Enter an array values ");
        //input array values
        for (int i = 0; i < array_size; i++){
            arr[i] = scanner.nextInt();
        }
        int temp;
        int start = 0;
        int end = array_size-1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("Array after reversing ");
        for (int j = 0; j < array_size; j++) {
            System.out.println(arr[j]);
        }
    }
}
