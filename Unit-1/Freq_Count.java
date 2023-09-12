import java.util.Scanner;
public class Freq_Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements of the array:");
        int n = in.nextInt();
        System.out.println("Enter elements of array:");
        int[] arr = new int[n];
        int[] counts = new int[n];
        int visited = -1,c = 0;
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0;i<n;i++){
            c = 1;
            for(int j = i+1;j<n;j++){
                if (arr[i] == arr[j]){
                    c+=1;
                    counts[j] = visited;
                }
            }
            if (counts[i]!=visited){
                counts[i] = c;
            }
        }
        System.out.println("Element\tFrequency");
        for(int i = 0;i<n;i++){
            if (counts[i]!=visited){
                System.out.println(arr[i]+"\t\t"+counts[i]);
            }
        }
    }
}
