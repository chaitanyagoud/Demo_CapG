import java.util.Scanner;


public class Bank {

	public static void main(String[] args) {
		long num;
        Scanner sc = new Scanner(System.in);
       // System.out.println("");
        long CustomerDetails[][]=  new long[4][4];
        		long Kotak[] = new long[3];
        		
		 for (int i = 0; i < Kotak.length; i++) ;
		 System.out.println("Enter the details: ");
		    for (int j = 0; j < CustomerDetails.length; j++) {
		    	
		    	int i;
				if(j==0)
		    	{
		    		System.out.println("enter the AccNo :");
		    		num = sc.nextLong();
		    	    CustomerDetails[i][j] = num;
		    	   
		    	}
				
		    	
		 
					num = sc.nextInt();
					accNo[i] = num;
					
					}
	               
	               for (int i = 0; i < accNo.length; i++) {
					System.out.println(accNo[i]);	
					}
			
		} 
               

	}

                                  
 
        

		

	}

}
