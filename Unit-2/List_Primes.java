import java.util.Scanner;
public class List_Primes {
    public static boolean isPrime(int num){
        for(int i = 2;i<num;i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements of the array:");
        int n = in.nextInt();
        System.out.println("Enter elements of array:");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("The Prime numbers in the list are: ");
        for(int i = 0;i<n;i++){
            if(isPrime(arr[i]) && arr[i]!=1) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
