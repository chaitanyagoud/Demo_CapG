import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		int num;
        Scanner sc = new Scanner(System.in);        
/*		int accNo[] = new int[5];
		 for (int i = 0; i < accNo.length; i++) {
				System.out.println("Enter the number : ");
				num = sc.nextInt();
				accNo[i] = num;
				
				}
                
                for (int i = 0; i < accNo.length; i++) {
				System.out.println(accNo[i]);	
				}
                

	}

}*/
        System.out.println("enter rows and cols");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int mat1[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
          for (int j = 0; j < col; j++) {
        	  System.out.println("enter the elements");
        	  num = sc.nextInt();
        	  mat1[j] = num;
          }
			
		}
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
          	  System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
		}
	}
}
	
                                  
 
        
