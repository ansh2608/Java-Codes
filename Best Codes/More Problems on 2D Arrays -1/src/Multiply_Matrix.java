import java.util.Scanner;

public class Multiply_Matrix {
    public static void print_matrix(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void multiply(int[][] a,int r1,int c1, int[][] b,int r2,int c2){
        int[][] ans= new int[r1][c2];
        if (c1 != r2){
            System.out.println("Invalid Dimensions!!!!!!!!!");
            return;
        }
        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<c1;k++){
                    ans[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        print_matrix(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Rows of matrix 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns of matrix 1: ");
        int c1 = sc.nextInt();
        System.out.println("Enter matrix 1: ");
        int[][] arr1 = new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter number of Rows of matrix 2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns of matrix 2: ");
        int c2 = sc.nextInt();
        System.out.println("Enter matrix 2: ");
        int[][] arr2 = new int[r2][c2];
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        print_matrix(arr1);
        print_matrix(arr2);
        multiply(arr1,r1,c1,arr2,r2,c2);
    }
}
