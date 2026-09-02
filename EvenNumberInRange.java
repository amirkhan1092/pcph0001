public class EvenNumberInRange {
    public static void main(String[] args) {
        // Even in a range 1 to 100

        // num % 10
        /*
        100 % 10 ===> 0
        123 % 10 ===> 3

        4 % 2 ===> 0 {100}
        5 % 2 ===> 1 {101}
        13 % 2 ===> 1 {1101}

        
        */

        for(int i=1; i<=100; i++){
            if(i % 2 == 0){
            System.out.println(i);
            }
        }

    }
}
