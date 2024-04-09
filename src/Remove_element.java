import java.util.ArrayList;
import java.util.Scanner;
//remove specific element
public class Remove_element {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int arr_size = scanner.nextInt();

        int arr[] = new int[arr_size];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<arr_size;i++)     //Array Initialization
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter the element you want to remove ");
        int elem = scanner.nextInt();
        //logic to remove specific element
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == elem)   //If element found
            {
                // shifting elements
                for(int j = i; j < arr.length - 1; j++)
                {
                    arr[j] = arr[j+1];
                }
                break;
            }
        }
        //print elements after deletion
       System.out.println("Elements after deletion :" );
        for (int i =0; i < arr.length-1; i++) {
            System.out.println(arr[i]+ " ");
        }
    }
}
