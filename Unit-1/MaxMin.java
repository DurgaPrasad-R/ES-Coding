import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements of the array:");
        int n = in.nextInt();
        System.out.println("Enter elements of array:");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int max = 0,min = 0;
        for(int i = 1;i<n;i++){
            if (arr[i]>arr[max]){
                max = i;
            }
            if (arr[i]<arr[min]){
                min = i;
            }
        }
        System.out.println("The maximum element is present at index: "+(max));
        System.out.println("The minimum element is present at index: "+(min));
    }
}
