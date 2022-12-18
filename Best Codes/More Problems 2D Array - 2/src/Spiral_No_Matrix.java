import java.util.Scanner;

public class Spiral_No_Matrix {
    public static void print_matrix(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] spiral(int n){
        int[][] a=new int[n][n];
        int top_row=0,bottom_row=n-1,left_col=0,right_col=n-1;
        int num=1;
        while (n*n>=num) {
            //top row -> left col to right col
            for (int j=left_col;j<=right_col && n*n>=num;j++){
                a[top_row][j]=num++;
            }
            top_row++;
            //right col -> top row to bottom row
            for (int i=top_row;i<=bottom_row && n*n>=num;i++){
                a[i][right_col]=num++;
            }
            right_col--;
            //bottom row -> right col to left col
            for (int j=right_col;j>=left_col && n*n>=num;j--){
                a[bottom_row][j]=num++;
            }
            bottom_row--;
            //left col -> bottom row to top row
            for (int i=bottom_row;i>=top_row && n*n>=num;i--){
                a[i][left_col]=num++;
            }
            left_col++;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Rows and columns of a squared matrix : ");
        int n = sc.nextInt();
        System.out.println("Spiral matrix : ");
        int[][] ans= spiral(n);
        print_matrix(ans);
    }
}