import java.util.*;

public class DigitSum {
        public static void main(String[] args) {
            // input section
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Positive Integer Number ");
            int num = sc.nextInt();
            sc.close();

            //logic section 
            // 123
            int sum = 0;
            int temp = num;
            while (num != 0){
                int d = num % 10;
                sum += d;
                num = num / 10;

            }


            // output section
            String out = "Digit Sum of a Number "+temp+" is " + sum;
            System.out.println(out);
        }


}
