package basics;

public class Bank {
sdf
	int accNo;
	int balance;
	Bank(){
		System.out.println("constructor is called");
hello		
	}
	 
	public Bank(int accNo, int balance ){
		this();
		this.accNo = accNo;
		this.balance = balance;
		System.out.println(accNo +" "+ balance);
		new Bank();
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bank b2 = new Bank(25, 100);
	}

}
