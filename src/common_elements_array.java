import java.util.*;

public class common_elements_array {
//Find common elements from 2 string arrays

    public static void main(String[] args) {
        String[] arr1 = new String[]{"chair", "table", "lamp", "laptop"};
        String[] arr2 = new String[]{"chair", "apple", "lamp", "pear"};
        //create common elements variable using list method
        List<String> commonElements = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    //to find common elements
                    commonElements.add(arr1[i]);
                    break;
                }
            }
        }
            //print common elements
        System.out.println("Common Elements: " +commonElements);

    }
}

