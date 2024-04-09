public class AscendingOrders {
    //write programe in ascending order

    public static void main(String[] args) {
        //Temp variable to store
int temp = 0;
int [] arr = new int[]{6,3,8,9,1};
//Holds each arrey
        for(int i =0;i < arr.length;i++){
            //compare with remaining array
            for(int j = i + 1; j < arr.length; j++) {
                // compare and swap
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;

                }

            }
        }

        System.out.println();
        //display elements after sorting array
        System.out.println("array sorted in assending order: ");

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
