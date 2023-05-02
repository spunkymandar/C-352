
public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Polymorphic reference
		//super_class ref=new subclass();
		Dog dog1=new Dog("Husky");
		Dog dog2=new Dog("BullDog");
		Dog dog3=new Dog("labrador");
		Cat c=new Cat();
		displayAnimal(dog1);
		displayAnimal(dog2);
		displayAnimal(dog3);
		displayAnimal(c);
		
	}
	
	public static void displayAnimal(Animal animal) {
		animal.animalBreathing();
		animal.animalEating();
		animal.animalSleeping();
		animal.animalTalking();
		
		if(animal instanceof Dog)
		{
			Dog d=(Dog)animal;
			System.out.println(d.dogType);
			if(d.dogType.equals("Husky"))
				d.animalSwimming();
			else
			System.out.print("I cannot swim, you should have purchased Husky !!");
		}
	}
}
