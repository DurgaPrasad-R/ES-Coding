public class GCD {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 30;
        System.out.println(gcd(n1,n2));
    }

    public static int gcd(int a,int b){
        if (a == 0){
            return b;
        } else {
            return gcd(b%a,a);
        }
    }
}