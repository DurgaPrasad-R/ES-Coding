import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean Prime = true;
        for(int i = 2;i<n;i++){
            if (n%i == 0){
                Prime = false;
                break;
            }
        }
        System.out.println("The given number is Prime: "+Prime);
    }
}
