import java.util.Scanner;

public class Kadane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements of the array:");
        int n = in.nextInt();
        System.out.println("Enter elements of array:");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int curr=0,max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            curr += arr[i];
            if(curr>max){
                max = curr;
            }
            if (curr<0){
                curr = 0;
            }
        }
        System.out.println(max);
    }
}
