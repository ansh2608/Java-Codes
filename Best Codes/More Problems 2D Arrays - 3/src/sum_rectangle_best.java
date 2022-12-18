import java.util.Scanner;

public class sum_rectangle_best {
    public static void print_matrix(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void prefix(int[][] arr){
        int r=arr.length;
        int c=arr[0].length;
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                arr[i][j] += arr[i][j-1];
            }
        }
        for (int j=0;j<c;j++){
            for (int i=1;i<r;i++){
                arr[i][j] += arr[i-1][j];
            }
        }
    }
    public static int rectangle(int[][] a,int l1,int r1,int l2,int r2){
        int ans,sum,up=0,left=0,left_up=0;
        prefix(a);
        sum = a[l2][r2];
        if (r1>=1){
            left = a[l2][r1-1];
        }
        if (l1>=1){
            up = a[l1-1][r2];
        }
        if (l1>=1 && r1>=1){
            left_up = a[l1-1][r1-1];
        }
        ans = sum - up - left + left_up;

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
        System.out.print("Enter the values of l1,r1,l2,r2: ");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Given matrix: ");
        print_matrix(arr);
        int ans=rectangle(arr,l1,r1,l2,r2);
        System.out.println("Rectangle sum of a given matrix: "+ans);
    }
}