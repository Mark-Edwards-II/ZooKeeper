
public class Bat extends Mammal {
	
	public void fly() {
		this.energy = this.energy - 50;
		System.out.println("wsh wsh wsh");
	}
	
	public void eatHumman() {
		this.energy = this.energy + 25;
		System.out.println("Eats human...");
	}
	
	public void attacktown() {
		this.energy = this.energy - 100;
		System.out.println("screams and the crackle of houses burning.");
	}
	
}
