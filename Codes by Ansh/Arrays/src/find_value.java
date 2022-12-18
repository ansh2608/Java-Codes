import java.util.Scanner;

public class find_value {
    public static void print_array(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int find(int arr[],int x){
        int ans=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                ans= i;
            }
        }
        return ans;
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
        System.out.print("Enter a element you want to find: ");
        int x=sc.nextInt();
        System.out.print("Array: ");
        print_array(arr);
        System.out.println(find(arr,x));
    }
}
