import java.util.Scanner;
public class Reverse_Arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements of the array:");
        int n = in.nextInt();
        System.out.println("Enter elements of array:");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
//        iterr_rev(arr,0,n-1);
        rec_rev(arr,0,n-1);
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void iterr_rev(int[] arr,int s,int e){
        while(s<e){
            int temp = arr[e];
            arr[e] = arr[s];
            arr[s] = temp;
            s++;
            e--;
        }
    }
    public static int[] rec_rev(int[] arr,int s,int e){
        if (s>e){
            return arr;
        }
        else {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            return rec_rev(arr,s+1,e-1);
        }
    }
}
