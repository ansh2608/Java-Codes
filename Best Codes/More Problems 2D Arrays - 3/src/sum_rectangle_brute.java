import java.util.Scanner;

public class sum_rectangle_brute {
    public static void print_matrix(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int rectangle(int[][] a,int l1,int l2,int r1,int r2){
        int ans=0;
        for (int i=l1;i<=l2;i++){
            for (int j=r1;j<=r2;j++){
                ans+=a[i][j];
            }
        }
        return ans;
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
        System.out.print("Enter the values of l1,l2,r1,r2: ");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Given matrix: ");
        print_matrix(arr);
        int ans=rectangle(arr,l1,l2,r1,r2);
        System.out.println("Rectangle sum of a given matrix: "+ans);
    }
}