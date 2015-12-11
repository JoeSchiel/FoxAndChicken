import java.util.ArrayList;

public class Fox extends Animal{

	public Fox()
	{
		
	}
	
	//eat method: (receive chickens arraylist as argument) 
	//Randomly removes a chicken from the population 70% of the time
	//and increases fox weight by the chosen chicken weight.	
	public void eat(ArrayList<Chicken> al)
	{
		//get a random number 1 - 10
		int percentRand = (int)(10 * Math.random()) + 1;
		
		//if 1-7 out of 10 is randomly selected we have 70%
		if(percentRand <= 7)
		{
			//If there are more than 1 chicken in the arraylist
			if(al.size() > 1 )
			{
			//Get a random index number from the ArrayList
			//so the fox is eating a random chicken.
			int randChickenIndex = (int)(al.size() * Math.random());
			setWeight(getWeight() + al.get(randChickenIndex).getWeight());
			al.remove(randChickenIndex);
			}
			//If their is only 1 chicken in the arraylist
			if(al.size() == 1 )
			{
				setWeight(getWeight() + al.get(0).getWeight());
				al.remove(0);
			}
		}
	}
	
	public void grow()
	{
		setAge(getAge() + 1);
	}

}
