
//Joe Schiel
//A program to simulate a battle between a fox and chickens. 
//Simulation continues as long as chicken population is greater than 1 and less than or equal 10 
//If chicken population is greater than 10 the chickens win.  Otherwise the Fox has 70% chance to eat
//a chicken and fox wins.

import java.util.ArrayList; 

public class FCMain
{

public static void main(String [] args)
{
      for (int count=0; count<10; count++)
      {
            Fox foxy = new Fox();
            ArrayList< Chicken > chickens = new ArrayList<Chicken>();
            chickens.add(new Chicken());
            chickens.add(new Chicken());
            chickens.add(new Chicken());
            chickens.get(0).setIsMale(true);
            chickens.get(1).setIsMale(false);
            chickens.get(2).setIsMale(false);

            while (chickens.size() >1 && chickens.size() < 10)
            {
            	//Error if brackets are added to the
            	//for loop because the ArrayList size changes.
                 for (Chicken c: chickens)
                        c.grow();
                        foxy.grow();
                        Chicken.mate(chickens);
                        foxy.eat(chickens);                       
            }

            //Output
            //format the weight to 2 decimal points.
            String weightFormat = String.format("%.2f" , foxy.getWeight());
            
            if(chickens.size() < 1){
            	System.out.println("Fox wins - Fox weight (in chickens): " + weightFormat );
            }
            if(chickens.size() >= 10){
            	System.out.println("Chickens win - Chicken population: " + chickens.size());
            }
     }

}
}
	/*
	try {
	    Thread.sleep(1000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
     	e.getMessage();	   
	}	
}
*/

