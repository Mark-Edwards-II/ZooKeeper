
public class Gorilla extends Mammal{

	public void throghSomething() {
		this.energy = this.energy -5;
		System.out.println("He's throughing his...");
	}
	
	public void eatBananas() {
		this.energy = this.energy + 10;
		System.out.println("Gorilla ate a banana and energy is now: "+this.energy);
	}
	public void climb() {
		this.energy = this.energy -10;
		System.out.println("Gorilla climbed the tree and energy is now: "+this.energy);
	}
}
