import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		System.out.println(fibonacciLoop(n+1));

	}
	public static long fibonacciLoop(Long number){
        if(number == 1 || number == 2){
            return 1;	
        }
        long fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
 
        }
        return fibonacci; //Fibonacci number
    }     
	

}
