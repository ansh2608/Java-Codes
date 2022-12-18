import java.util.Scanner;

public class Perfect_Matrix {
    public static void Print_Matrix(int [][] arr){
        for (int i=0; i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the no of columns: ");
        int c = sc.nextInt();
        System.out.println("Enter the elements of the matrix: ");
        int[][] arr = new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given Array: ");
        Print_Matrix(arr);
        System.out.println("Perfect Matrix: ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (i==j || i+j==r-1){
                    if (arr[i][j] == 0){
                        System.out.println("false");
                        return;
                    }
                }
                else {
                    if (arr[i][j] != 0){
                        System.out.println("false");
                        return;
                    }
                }
            }
        }
        System.out.println("true");
    }
}
