package interfacee;

public class Calculator implements Operations {
	
	
	public static void main(String[] args) {
	 Calculator s1 = new Calculator();
	 s1.add();
	 s1.sub();
	 
	}

	public void add() {
		
		System.out.println("add");
		
	}

	public void sub() {
		
		System.out.println("sub");
		
	}

}
