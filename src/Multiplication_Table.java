public class Multiplication_Table {
//Print multiplication table using do while loop
    public static void main(String[] args) {

        int i = 1;

        do {
            //print multiplication table using multidimensional method upto 3
            System.out.println(i+ " " + (2*i)+ " " + (3*i));
            i++;
        }
        while (i<=3);
    }
}
