import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class that contains a collection of Lamborghini objects
 * @author Gustavo Correa
 * @version 1.0
 */
public class LamborghiniCarLot
{
    
    private String lotName;
    private ArrayList<Lamborghini> inventory;
    
    public static final int OLDEST_MODEL_YEAR = 1920;
    public static final int CURRENT_YEAR = 2018;
    private static final double HORSEPOWER_MIN_VALUE = 300;
    private static final double HORSEPOWER_MAX_VALUE = 600;
    private static final int MIN_STRING_LENGTH = 1;
   
   
   
    /**
     * Main constructor. Defines the name of the lot. Creates the inventory ArrayList object. Adds the Lamborghini objects
     * @param lotName. String the name of the lot object. Can't be null or empty. If the value passed is 
     * "Taylor's Used Lambos", it should store "Jason's Used Lambos" instead 
     */
    public LamborghiniCarLot(String lotName)
    {
        inventory = new ArrayList<Lamborghini>();
       
        inventory.add(new Lamborghini(1965, "350GT", 365.3, true));
        inventory.add(new Lamborghini(1966, "400GT 2+2", 366.3, false));
        inventory.add(new Lamborghini(1967, "MIURA", 367.3, true));
        inventory.add(new Lamborghini(1968, "espada", 368.3, false));
        inventory.add(new Lamborghini(1969, "islero", 369.3, true));
        inventory.add(new Lamborghini(1970, "jarama", 370.3, false));
        inventory.add(new Lamborghini(1971, "urraco", 371.3, false));
        inventory.add(new Lamborghini(1971, "urraco", 371.3, false));
        inventory.add(new Lamborghini(1973, "countache", 373.3, false));
        inventory.add(new Lamborghini(1974, "silhouette", 374.3, false));
        inventory.add(new Lamborghini(1975, "jalpa", 375.3, true));
        inventory.add(new Lamborghini(1976, "silhouette", 476.3, false));
        inventory.add(new Lamborghini(1977, "silhouette", 377.3, true));
        inventory.add(new Lamborghini(1978, "countache", 478.3, false));
        inventory.add(new Lamborghini(1978, "countache", 578.3, false));
        inventory.add(new Lamborghini(1978, "countache", 378.3, true));
        inventory.add(new Lamborghini(1979, "silhouette", 479.3, false));
        inventory.add(new Lamborghini(1980, "countache", 580.3, false));
        inventory.add(new Lamborghini(1981, "jalpa", 381.3, true));
        inventory.add(new Lamborghini(1981, "jalpa", 481.3, true));
        inventory.add(new Lamborghini(1982, "countache", 582.3, true));
        inventory.add(new Lamborghini(1983, "countache", 383.3, false));
        inventory.add(new Lamborghini(1984, "countache", 484.3, false));
        inventory.add(new Lamborghini(1985, "countache", 585.3, false));
        inventory.add(new Lamborghini(1986, "lm002", 386.3, true));
        inventory.add(new Lamborghini(1987, "jalpa", 487.3, false));
        inventory.add(new Lamborghini(1988, "countache", 588.3, false));
        inventory.add(new Lamborghini(1989, "countache", 389.3, true));
        inventory.add(new Lamborghini(1990, "diablo", 490.3, false));
        inventory.add(new Lamborghini(1991, "lm002", 591.3, false));
        inventory.add(new Lamborghini(1991, "lm002", 391.3, true));
        inventory.add(new Lamborghini(1991, "lm002", 491.3, false));
        inventory.add(new Lamborghini(1991, "lm002", 591.3, true));
        inventory.add(new Lamborghini(1992, "lm002", 392.3, false));
        inventory.add(new Lamborghini(1993, "lm002", 493.3, false));
        inventory.add(new Lamborghini(1994, "diablo", 594.3, false));
        inventory.add(new Lamborghini(1994, "diablo", 394.3, true));
        inventory.add(new Lamborghini(1995, "diablo", 495.3, false));
        inventory.add(new Lamborghini(1996, "diablo", 596.3, false));
        inventory.add(new Lamborghini(1997, "diablo", 397.3, false));
        inventory.add(new Lamborghini(1998, "diablo", 498.3, false));
        inventory.add(new Lamborghini(1999, "diablo", 599.3, false));
        inventory.add(new Lamborghini(1999, "diablo", 599.3, false));
        inventory.add(new Lamborghini(2000, "diablo", 400.3, false));
        inventory.add(new Lamborghini(2000, "diablo", 500.3, false));
        inventory.add(new Lamborghini(2001, "murcielago", 501.3, false));
        inventory.add(new Lamborghini(2002, "murcielago", 502.3, false));
        inventory.add(new Lamborghini(2003, "gallardo", 303.3, true));
        inventory.add(new Lamborghini(2004, "murcielago", 404.3, true));
        inventory.add(new Lamborghini(2005, "murcielago", 505.3, true));
        inventory.add(new Lamborghini(2006, "gallardo", 506.3, true));
        inventory.add(new Lamborghini(2007, "gallardo", 507.3, true));
        inventory.add(new Lamborghini(2008, "reventon", 308.3, false));
        inventory.add(new Lamborghini(2008, "reventon", 508.3, true));
        inventory.add(new Lamborghini(2009, "gallardo", 409.3, true));
        inventory.add(new Lamborghini(2010, "murcielago", 310.3, false));
        inventory.add(new Lamborghini(2011, "aventador", 411.3, false));
        inventory.add(new Lamborghini(2012, "sesto elemento", 512.3, true));

        if (lotName.equals("Taylor's Used Lambos"))
        {
            setLotName("Jason's Used Lambos");
        }else
        {
            setLotName(lotName); 
        }
       
       
    }
   
    /**
     *constructor. Creates the inventory ArrayList
     */
    public LamborghiniCarLot()
    {
        inventory = new ArrayList<Lamborghini>();
    }
   
    /**
     * mutator for lotName
     * @param lotName. String. Can't be null or empty
     */
    public void setLotName(String lotName)
    {
        if(lotName == null && lotName.length()<MIN_STRING_LENGTH)
        {
            throw new IllegalArgumentException("Please enter a name for the lot");             
        }else
        {
            this.lotName = lotName;   
        }
    }
    
    /**
     * mutator for inventory
     * @param inventory. ArrayList of Lamborghini objects. 
     */
    public void setInventory(ArrayList<Lamborghini> inventory)
    {
        if (inventory != null)
        {
            this.inventory = inventory;
        }
    }
   
    /**
     * accessor for lotName
     * @return lotName. String
     */
    public String getLotName()
    {
        return lotName;  
    }
    
    /**
     * accessor for inventory
     * @return ArrayList of Lamborghini objects
     */
    public ArrayList<Lamborghini> getInventory()
    {
        return inventory;
    }
    
        
    /**
     * adds a new Lamborghini to the inventory
     * @param newLamborghini. Lamborghini object. The new car to be added. Can't be null
     */
    public void addLamborghini(Lamborghini newLamborghini)
    {
        if (newLamborghini == null)
        {
            throw new IllegalArgumentException("Nothig to add");
        }else
        {
            inventory.add(newLamborghini);
        }
    }
    
    /**
     * returns the number of Lamborghinis in inventory whose model year is between these years
     * @param startYear int. The first year in the range. Needs to be between 1920 and 2018
     * @return count int. How many cars matched the condition
     */
    public int howManyBetweenTheseYears(int startYear, int endYear)
    {
        int count = 0; //counts how many cars match the condition. Will be returned
               
        for(Lamborghini lambo: inventory)
        {
            if (lambo ==  null)
            {
                continue;
            }
            
            if(lambo.getModelYear() >= startYear && lambo.getModelYear() <= endYear)
            {
                count++;        
            }
        }
        
        return count;
    }
    
    /**
     * returns the number of Lamborghinis that are rear-wheel drive
     * @return count int. The number of rear-wheel drive lambos
     */
    public int howManyAreRearWheelDrive()
    {
        Iterator<Lamborghini> lambo = inventory.iterator();
        int count = 0;
        
        while(lambo.hasNext())
        {
            Lamborghini test = lambo.next();
            
            if(test==null)
            {
                continue;
            }
            
            if(test.getIsRearWheelDrive())
            {
                count++;    
            }
        }
        
        return count;
        
    }
    
    /**
     * creates an array list with the cars from the provided year
     * @param year int. The year you are researching. Needs to be between 1920 and 2018
     * @return ArrayList<Lamborghini> will be empty if no mtaches. 
     */
    public ArrayList<Lamborghini> getCarsFromThisYear(int year)
    {
        ArrayList<Lamborghini> tempList = new ArrayList<Lamborghini>();
                
        for(Lamborghini lambo : inventory)
        {
            if(lambo == null)
            {
                continue; 
            }
            
            if(lambo.getModelYear() == year)
            {
                tempList.add(lambo);
            }
        }
        
        return tempList;
    }
    
    /**
     * a method to identify cars with horsepower within the provided range
     * @param lowHP double. the lower end of the range. Needs to be between 300 and 600
     * @param highHP double. the higher end of the range. Needs to be between 300 and 600
     * @return result array. The collection of cars that match the conditions
     */
    public Lamborghini[] getCarsWithHorsepowerRange(double lowHP, double highHP)
    {
        ArrayList<Lamborghini> temp = new ArrayList<Lamborghini>();
        
        //if (lowHP < HORSEPOWER_MIN_VALUE || highHP < HORSEPOWER_MIN_VALUE || lowHP > HORSEPOWER_MAX_VALUE || highHP > HORSEPOWER_MAX_VALUE)
        //{
        //    throw new IllegalArgumentException("Please enter a valid HP value between " + HORSEPOWER_MIN_VALUE + " and " + HORSEPOWER_MAX_VALUE); 
        //}
        
        if(highHP <= lowHP)
        {
            throw new IllegalArgumentException("This value needs to be higher than the first one");
        }
        
        for(Lamborghini lambo : inventory)
        {
            if(lambo == null)
            {
                continue;
            }
            
            if(lambo.getHorsepower() > lowHP && lambo.getHorsepower() < highHP)
            {
                temp.add(lambo);
            }
        }
        
        Lamborghini[] result = new Lamborghini[temp.size()];
        
        result = temp.toArray(result);
        return result;
    }
    
    /**
     * checks if a passed model exists in the collection
     * @param modelName String. can't be null. the model to be checked
     * @return boolean. True if the car exists in the collection
     */
    public boolean hasCarModel(String modelName)
    {
        if(inventory == null)
        {
            return false;
        }
        
        // if(modelName == null || modelName.length()<1)
        // {
            // throw new IllegalArgumentException("This field cannot be empty");
        // }
        
        for(Lamborghini lambo : inventory)
        {
            if(lambo == null)
            {
                continue;
            }
            
            if(lambo.getModelName().equalsIgnoreCase(modelName))
            {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * calculates the average HP for all models in the provided year
     * @param modelYear int. the year you wan to check
     * @return avgHP double. The average HP of the models on that year
     */
    public double getAverageHorsepowerOfYear(int modelYear)
    {
        double avgHP = 0;
        int count = 0;
               
        for(Lamborghini lambo : inventory)
        {
            if(lambo == null)
            {
                continue;
            }
            
            if(lambo.getModelYear() == modelYear)
            {
                count++;
                avgHP += lambo.getHorsepower();
            }
        }
        
        if(count == 0)
        {
            return 0.0;
        }
        
        return avgHP/count;
    }
    
    
   
   
   
   
      
   
}