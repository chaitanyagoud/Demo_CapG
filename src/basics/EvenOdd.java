package basics;
import java.util.Scanner;

public class EvenOdd {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first num");
	  short num = sc.nextShort();
	  if(num%2 == 0)
	  {
		  num+=10;
		  System.out.println(num); 
		  
	  }
	  else
	  {
		  num+=15;
		  System.out.println(num); 
	  }
	   
		  
		
	}

}
