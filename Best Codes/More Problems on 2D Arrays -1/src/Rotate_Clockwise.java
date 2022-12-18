import java.util.Scanner;

public class Rotate_Clockwise {
    public static void print_matrix(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][] a,int r1,int c1){
        for (int i=0;i<r1;i++){
            for (int j=i;j<c1;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
    public static void rotate(int[][] arr,int n){
        transpose(arr,n,n);
        for (int i=0;i<n;i++){
            for (int j=n-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
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
        System.out.println("Given matrix: ");
        print_matrix(arr1);
        System.out.println("Transpose matrix of a given matrix: ");
        rotate(arr1,r1);
    }
}
