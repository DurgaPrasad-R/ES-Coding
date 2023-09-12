import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements of the array:");
        int n = in.nextInt();
        System.out.println("Enter start times:");
        int[] start = new int[n];
        for(int i = 0;i<n;i++){
            start[i] = in.nextInt();
        }
        System.out.println("Enter end times:");
        int[] end = new int[n];
        for(int i = 0;i<n;i++){
            end[i] = in.nextInt();
        }
        sortSE(start,end,n);

        int finishTime = end[0];
        int c = 1;
        for(int i = 1;i<n;i++){
            if (start[i]>=finishTime){
                c+=1;
                finishTime = end[i];
            }
        }
        System.out.println(c);
    }
    // To sort the endTime and startTime simultaneously

    public static void sortSE(int[] start,int[] end,int n) {
        int min = 0;
        for(int i=0;i<n;i++){
            min = i;
            for(int j = i+1;j<n;j++){
                if (end[j]<end[i]){
                    min = j;
                }
            }
            if (min!=i){
                int temp1 = start[i];
                start[i] = start[min];
                start[min] = temp1;
                int temp2 = end[i];
                end[i] = end[min];
                end[min] = temp2;
            }
        }
    }
}
