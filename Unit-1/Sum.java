import java.util.Scanner;
public class Sum {
    public static int iter_sum(int[] arr,int n){
        int s = 0;
        for(int i = 0;i<n;i++){
            s+=arr[i];
        }
        return s;
    }
    public static int rec_sum(int[] arr,int n){
        if (n < 0) {
            return 0;
        }
        else {
            return arr[n] + rec_sum(arr, n - 1);
        }
    }
    public static void main(String[] args) {
        int s = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements of the array:");
        int n = in.nextInt();
        System.out.println("Enter elements of array:");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("The Sum of elements of array is: "+iter_sum(arr,n));
        System.out.println("The Sum of elements of array is: "+rec_sum(arr,n-1));
    }
}