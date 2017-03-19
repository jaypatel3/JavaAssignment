package assignment2;

public class ExOverriding extends Car {

	public static void main(String[] args) {
		
		Car p = new Car();
		p.function();
		
		NewCar c = new NewCar();
		c.function();
		
		Car p1 = new NewCar();
		p1.function();
			
	}

}
class Car {
	
	public void function(){
		
		System.out.println("Add the Normal Features");
	}
	
}

class NewCar extends Car{
	
	public void function(){
		
		System.out.println("Add New Features whatever you want");
	}
}
