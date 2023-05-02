
public  class Dog extends Animal{
	String dogType;
	
	public Dog(String dogType) {
		this.dogType=dogType;
	}
	//method overrding... reimplementing the method from the super class
	public void animalTalking() {
		System.out.println("dog is barking");
	}
	
	public void animalSwimming() {
		//super.animalTalking();;
		System.out.println("I am "+this.dogType +", I can swim.. BUT CANNOT BUTTERFLY");
	}
	

}
