
public  class Bird extends Animal{
	@Override
	public int fly() {
		System.out.println("I am flying");
		return 1;
		}
	@Override
	public  int sing() 
	{
		System.out.println("I am singing");
		return 1;
	}	
}
 class Duck extends Bird  {
	 @Override
	public	int sing() {
		System.out.println("Quack, quack");
		return 1;
	}
	 @Override
	public int swim() {
		System.out.println("I can swim");
		return 1;
	}
}
 class Chicken extends Bird {
	@Override
	public int sing() {
		System.out.println("Cluck, cluck");
		return 1;
	}
	@Override
	public int fly() {
		System.out.println("I cannot fly");
		return 1;
	}
}

 class Rooster extends Chicken {
	 @Override
	public int sing()
	{
		System.out.println("Cock-a-doodle-doo");
		return 1;
	}
}
  class Parrot extends Bird {
	// ok how will i call this method from main
	public int sing(Dog dog) {
		System.out.println("Woof, woof");
		return 1;
	}

	public int sing(Cat cat) {
		System.out.println("Meow");
		return 1;
	}
	public int sing(Rooster rooster) {
		System.out.println("Cock-a-doodle-doo");
		return 1;
	}
}