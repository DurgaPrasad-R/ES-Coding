import java.util.Scanner;

public class PrimeSieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = in.nextInt();
        int[] sieve = Sieve(n);
        for(int i = 2;i<=n;i++){
            if (sieve[i] == 1){
                while(n%i == 0){
                    System.out.print(i+" ");
                    n = n/i;
                }
            }
        }

    }
    public static int[] Sieve(int n)
    {
        int[] res = new int[n+1];
        boolean[] prime = new boolean[n+1];
        for(int i = 0;i<=n;i++){
            prime[i] = true;
        }

        for(int i = 2;i*i<=n;i++){
            if (prime[i]){
                for(int j = i*i;j<=n;j+=i){
                    prime[j] = false;
                }
            }
        }
        for(int i = 2;i<=n;i++){
            if (prime[i]){
                res[i] = 1;
            }
        }
        return res;
    }
}
