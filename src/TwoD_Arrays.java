public class TwoD_Arrays {
    //to transpose matrix 2D array
        static int N = 4;
        //Transpose method
        static void transpose (int A[][])
        {
            for (int i = 0; i < N; i++)
                for (int j = i + 1; j < N; j++) {
                    int temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = temp;
                }
        }
        // main function
        public static void main (String[]args)
        {
            int A[][] = {{1, 1, 1, 1},
                    {2, 2, 2, 2},
                    {3, 3, 3, 3},
                    {4, 4, 4, 4}};
            //print original matrix
            System.out.println("Original matrix is");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.print(A[i][j] + " ");
                System.out.println();
            }
            //convert original matrix to transposed matrix
            transpose(A);
            //print transposed matrix
            System.out.print("Transposed matrix is \n");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.print(A[i][j] + " ");
                System.out.print("\n");
            }
        }
    }

