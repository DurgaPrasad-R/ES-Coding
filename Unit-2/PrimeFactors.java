import java.util.Scanner;

public class PrimeFactors {

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
        System.out.print("Enter a number:");
        int n = in.nextInt();
        System.out.print("Prime Factors are: ");
        for(int i = 2;i<=n;i++){
            while (n%i == 0 && isPrime(i))
            {
                System.out.print(i+" ");
                n = n/i;
            }
        }
    }
}
