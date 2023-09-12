import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = in.nextInt();
        int s = 0;
        System.out.print("The Divisors of the number are:");
        for(int i = 1;i<=n;i++){
            if (n%i == 0){
                s+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.print("The sum of Divisors is: ");
        System.out.print(s);
    }
}
