import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        // Input 
        /*
        5
        20 13 5 7 20
        */
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int [] arr = new int[n];
       for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

       sc.close();

        // logic 
        int mx1 = Integer.MIN_VALUE;
        int mx2 = Integer.MIN_VALUE;


        for(int i=0; i<n; i++){
            if(mx1 < arr[i]){
                mx2 = mx1;
                mx1 = arr[i]; 
            }
            if(mx2 < arr[i] && arr[i] < mx1){
                mx2 = arr[i];
            }
                
        }
    


        // Output
        System.out.println(mx);
    }
}
