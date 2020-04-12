public class Fish extends Animal {
	public int sing() {
		System.out.println("I cant sing");
		return 1;
	}
	public int walk() {
		System.out.println("i cant walk");
		return 1;
	}
	
	public int swim() {
		System.out.println("I can swim");
		return 1;
	}
}
class Shark extends Fish {
	@Override
	public 	int swim() {
		super.swim();
		return 1;
	}
	@Override
	public void eat() {
		System.out.println("I eat other fish");
	}
}
class Clownfish extends Fish {
	@Override
	public int swim() {
		super.swim();
		return 1;
	}
}
class Dolhpin extends Animal {
	@Override
	public int swim()
	{
		System.out.println("I can swim");
		return 1;
	}
}
