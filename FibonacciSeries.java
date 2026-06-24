public class FibonacciSeries {
    public static void main(String[] args) {
       int n = 10;
       int first = 0,second = 1, third;

       for(int i = 0 ; i < n; i++) {

           third = first + second;
           System.out.print(third + " ");
           first = second;
           second = third;
       }

    }
}