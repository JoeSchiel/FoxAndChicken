
import java.util.ArrayList;

public class Chicken extends Animal{
	
	public Chicken()
	{
		setAge(1);
		setWeight(1);
		
		//Randomly choose sex and assign to isMale 
		//Random integer 1-2. if we don't add 1 we get 0-1
		int sexRand = (int)(2 * Math.random()) + 1;

		if(sexRand == 1)
		{
			setIsMale(true);
		}
		else if(sexRand == 2)
		{
			setIsMale(false);
		}
	}
	
	//Overrides parent class(LiFiAnimal.grow)
	public void grow()
	{ 
		setAge(getAge() + 1);
		
		//Increase weight of chicken by 1% of current weight
		setWeight(getWeight() + (getWeight() * .01));
	}
	
	public static void mate(ArrayList<Chicken> al)
	{		
		//Randomly select an int that is the index of the chickens to compare
		int firstChickenIndex = (int)(al.size() * Math.random());
		int secondChickenIndex = (int)(al.size() * Math.random());
		
		//We don't want to compare the same chicken
		//If the index is the same, get a new random index number
		//until we have 2 different chickens
		while(firstChickenIndex == secondChickenIndex)
		{
			secondChickenIndex = (int)(al.size() * Math.random());
		}
		
		//First check, are both chickens older than 1 day?
		if(al.get(firstChickenIndex).getAge() > 1 && al.get(secondChickenIndex).getAge() > 1)
		{
			//2nd check, do we have a male and female?
			if(al.get(firstChickenIndex).getIsMale() == true && al.get(firstChickenIndex).getIsMale() == false ||
			   al.get(secondChickenIndex).getIsMale() == false && al.get(firstChickenIndex).getIsMale() == true)
			{
				//Successful mating conditions! Add a random amount of chickens from 0-4
				int numChicksToAdd = (int)(5 * Math.random());
				for(int i = 0; i < numChicksToAdd ; i++)
				{
					al.add(new Chicken());
				}			
			}
		}
		
	}
}

