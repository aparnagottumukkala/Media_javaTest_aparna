
public class FactoryPatternAnimals {

	public static void main(String[] args) {
		int walk=0,sing=0,fly=0,swim=0;
		// TODO Auto-generated method stub
		AnimalFactory animalFactory= new AnimalFactory();
		IAnimal animal1 = animalFactory.getAnimal("Dog");
		walk+=animal1.walk();
		
		IAnimal animal2 = animalFactory.getAnimal("Cat");
		//animal2.walk();
		walk+=animal2.walk();
		
		IAnimal animal3 = animalFactory.getAnimal("FRog");
		//animal3.walk();
		walk+=animal3.walk();
		
		IAnimal bird1 = animalFactory.getAnimal("Duck");
		
		sing+=bird1.sing();
		swim+=bird1.swim();
		
		IAnimal bird2 = animalFactory.getAnimal("Chicken");
		sing+=bird2.sing();
		fly+=bird2.fly();
		
		IAnimal bird3 = animalFactory.getAnimal("Rooster");
		sing+=bird3.sing();
		
		Parrot bird4 = (Parrot) animalFactory.getAnimal("Parrot");
		bird4.sing(new Dog());
		bird4.sing(new Cat());
		bird4.sing(new Rooster());
		
		IAnimal fish1 = animalFactory.getAnimal("Shark");
		fish1.eat();
		swim+=fish1.swim();
		
		IAnimal fish2 = animalFactory.getAnimal("Clownfish");
		//fish2.eat();
		swim+=fish2.swim();
		
		IAnimal fish3 = animalFactory.getAnimal("Dolhpin");
		swim+=fish3.swim();
		
		IAnimal catterpillar=animalFactory.getAnimal("Butterfly",2);
		fly+=catterpillar.fly();
		sing+=catterpillar.sing();
		
		IAnimal butterfly=animalFactory.getAnimal("Butterfly",7);
		fly+=butterfly.fly();
		sing+=butterfly.sing();
		
		System.out.println("walking animals count "+walk);
		System.out.println("Flying animals count "+fly);
		System.out.println("Singing animals count "+sing);
		System.out.println("Swimming animals count "+swim);
	}

}
