package assignment2;

interface Movable { 
	
	void move();
	
}

interface Rollable{
	
	void roll();
}

interface Transferalbe extends Movable{
	
	void transfer();
}

public class ExMultiInterface implements Transferalbe,Rollable{


	@Override
	public void move() {
		
		System.out.println("Movable Interface");
		
		
	}

	@Override
	public void roll() {
		
		System.out.println("rollable Interface");
		
	}
	
	@Override
	public void transfer() {
		
		System.out.println("Transferble Interface");
		
	}
		
	
	public static void main(String[] args) {
		
		
		ExMultiInterface  e = new ExMultiInterface();
		e.move();
		e.roll();
		e.transfer();
		
	
	}


}
