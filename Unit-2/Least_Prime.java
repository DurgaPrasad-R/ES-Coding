import java.util.Scanner;

public class Least_Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = in.nextInt();
        System.out.println(leastPrime(n));
    }
    public static int leastPrime(int n){
        for(int i = 2;i*i<=n;i++){
            if (n%i == 0){
                return i;
            }
        }
        return n;
    }
}
