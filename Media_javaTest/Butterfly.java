
public class Butterfly extends Animal{
	
	int weeks;
	Butterfly(int weeks){
		 this.weeks=weeks;
	}
	@Override
	public int fly() {
		
		if(weeks<=5) {
			System.out.println("I cannot fly");
			return 0;
		}else {
			System.out.println("I can fly");
			return 1;
		}
		
	}
	@Override
	public int sing() {
		System.out.println("I dont make sound");
		return 0;
	}
}
