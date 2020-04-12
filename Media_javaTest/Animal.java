class Animal implements IAnimal
{
	public int walk() {
		return 0;
	}
	public int sing() {
		return 0;
	}
	
	public int fly() {
		return 0;
	}
	public int swim() {
		return 0;
	}
	public void eat() {}

}

class Dog extends Animal {
	@Override
	public int walk() {
		 System.out.println("I can walk");
		 return 1;
	}
}
class Cat extends Animal {
	@Override
	public int walk() {
		 System.out.println("I can walk");
		 return 1;
	}
}

class Frog extends Animal {
	@Override
	public int walk() {
		 System.out.println("I can walk");
		 return 1;
	}
}