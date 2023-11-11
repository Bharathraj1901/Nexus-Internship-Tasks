import java.util.*;

public class FibonacciSeries
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Enter the Fibonacci Series Count:");
	    int num=scan.nextInt();
		Fibonacci(num);
	}
	
	public static void Fibonacci(int count)  {
          int n1=0,n2=1,n3,i;    
          System.out.print(n1+" "+n2);  
           for(i=2;i<count;++i) {    
             n3=n1+n2;    
             System.out.print(" "+n3);    
             n1=n2;    
             n2=n3;    
            }    
    }  
}
