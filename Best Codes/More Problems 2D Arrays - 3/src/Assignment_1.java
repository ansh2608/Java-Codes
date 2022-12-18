import java.util.Scanner;

public class Assignment_1 {
    public static void Print_Matrix(int [][] arr){
        for (int i=0; i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void Prefix(int[][] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr[0].length;j++){
                arr[i][j] += arr[i][j-1];
            }
        }
        Print_Matrix(arr);
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
        Prefix(arr);
    }
}
