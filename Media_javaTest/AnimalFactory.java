
public class AnimalFactory {

	public IAnimal getAnimal(String animalType)
	{
		 if(animalType == null){
	         return null;
	      }		
	      if(animalType.equalsIgnoreCase("Dog")){
	         return new Dog();
	         
	      } else if(animalType.equalsIgnoreCase("CAT")){
	         return new Cat();
	         
	      } else if(animalType.equalsIgnoreCase("FROG")){
	         return new Frog();
	      } else if(animalType.equalsIgnoreCase("Duck")){
		         return new Duck();
		      }else if(animalType.equalsIgnoreCase("Chicken")){
			         return new Chicken();
		      }else if(animalType.equalsIgnoreCase("Rooster")){
			         return new Rooster();
		      }else if(animalType.equalsIgnoreCase("Parrot")){
			         return new Parrot();
		      } else if(animalType.equalsIgnoreCase("Shark")){
			         return new Shark();
		      } else if(animalType.equalsIgnoreCase("Clownfish")){
			         return new Clownfish();
		      }
		      else if(animalType.equalsIgnoreCase("Dolhpin")){
			         return new Dolhpin();
		      }
		      
	      
	      return null;
	}
	public IAnimal getAnimal(String animalType,int weeks)
	{
		if(animalType.equalsIgnoreCase("Butterfly")){
	         return new Butterfly(weeks);
		}
		return null;
	}
	
}
