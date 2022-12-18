import java.util.Scanner;

public class Spiral_Matrix {
    public static void print_matrix(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void spiral(int[][] a,int r1,int c1){
        int top_row=0,bottom_row=r1-1,left_col=0,right_col=c1-1;
        int total_elements=0;
        while (r1*c1>total_elements) {
            //top row -> left col to right col
            for (int j=left_col;j<=right_col && r1*c1>total_elements;j++){
                System.out.print(a[top_row][j]+" ");
                total_elements++;
            }
            top_row++;
            //right col -> top row to bottom row
            for (int i=top_row;i<=bottom_row && r1*c1>total_elements;i++){
                System.out.print(a[i][right_col]+" ");
                total_elements++;
            }
            right_col--;
            //bottom row -> right col to left col
            for (int j=right_col;j>=left_col && r1*c1>total_elements;j--){
                System.out.print(a[bottom_row][j]+" ");
                total_elements++;
            }
            bottom_row--;
            //left col -> bottom row to top row
            for (int i=bottom_row;i>=top_row && r1*c1>total_elements;i--){
                System.out.print(a[i][left_col]+" ");
                total_elements++;
            }
            left_col++;
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
        spiral(arr1,r1,c1);
    }
}
