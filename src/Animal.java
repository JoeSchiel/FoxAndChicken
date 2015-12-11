
public class Animal
{
	
	private String name; 
	private int age;
	private double weight;
	private boolean isMale;

	//default constructor
	public Animal()
	{
		
		this.name = "";
		this.age = 1;
		this.weight = 0;
		this.isMale = true;		
	}
	
	//Accessor/Mutators (getters/setters)
	public String getName()
	{
		return this.name;
	}

	public void setName(String n)
	{
		this.name = n;
	}

	public int getAge()
	{
		return this.age;
	}

	public void setAge(int a)
	{
		this.age = a;
	}

	public double getWeight(){
		return this.weight;
	}

	public void setWeight(double w)
	{
		this.weight = w;
	}

	public boolean getIsMale()
	{
		return this.isMale;
	}

	public void setIsMale (boolean im)
	{
		this.isMale = im;
	}
	
	//Each turn the animal "ages"
	public void grow()
	{
		this.age++;
	}
}
