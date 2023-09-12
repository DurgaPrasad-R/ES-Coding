import java.util.Scanner;
public class Prefix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements of the array:");
        int n = in.nextInt();
        System.out.println("Enter elements of array:");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int[] pre_sum = prefix_sum(arr,n);
        System.out.print("Prefix Sums of elements is: ");
        for(int i = 0;i<n;i++){
            System.out.print(pre_sum[i]+" ");
        }
        System.out.println();
        System.out.print("Prefix Product of elements is: ");
        int[] pre_pro = prefix_product(arr,n);
        for(int i = 0;i<n;i++){
            System.out.print(pre_pro[i]+" ");
        }
    }

    public static int[] prefix_sum(int[] arr,int n){
        int[] sum = new int[n];
        sum[0] = arr[0];
        for(int i=1;i<n;i++){
            sum[i] = sum[i-1]+arr[i];
        }
        return sum;
    }
    public static int[] prefix_product(int[] arr,int n){
        int[] product = new int[n];
        product[0] = arr[0];
        for(int i=1;i<n;i++){
            product[i] = product[i-1]*arr[i];
        }
        return product;
    }
}