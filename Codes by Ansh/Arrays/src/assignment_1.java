import java.util.Scanner;

public class assignment_1 {
    public static void print_array(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int sum(int arr[]){
        int count=0;
        for (int i=0;i<arr.length;i++){
            count += arr[i];
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter an Array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array: ");
        print_array(arr);
        System.out.print("The sum of given array: ");
        System.out.print(sum(arr));
    }
}
