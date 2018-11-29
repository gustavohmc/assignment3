import java.util.ArrayList;

/**
 * defines a collection of LarborghiniCarLot classes
 * @author Gustavo Correa
 * @version 1.0
 * 
 */
public class LamborghiniDealershipGroup
{
    private String dealershipGroupName;
    private ArrayList<LamborghiniCarLot> carLots;
    
    public static final int OLDEST_MODEL_YEAR = 1920;
    public static final int CURRENT_YEAR = 2018;
    private static final double MIN_HP = 300;
    private static final double MAX_HP = 600;
    private static final int MIN_STRING_LENGTH = 1;
    
    /**
     * default constructor. Creates the ArrayList, but doesn't set the dealership name
     */
    public LamborghiniDealershipGroup()
    {
        carLots = new ArrayList<LamborghiniCarLot>();
                
    }
    
    /**
     * constructor. Defines the name for the dealership and builds the array list
     * @param dealershipGroupName. String. Can't be null or empty
     */
    public LamborghiniDealershipGroup(String dealershipGroupName)
    {
        carLots = new ArrayList<LamborghiniCarLot>();
        
        setDealershipGroupName(dealershipGroupName);
        
        LamborghiniCarLot carlot1 = new LamborghiniCarLot();

        carlot1.setLotName("Jason's vintage lambos.");
        carlot1.addLamborghini(new Lamborghini(1965, "350GT", 365.3, true));
        carlot1.addLamborghini(new Lamborghini(1966, "400GT 2+2", 366.3, false));
        carlot1.addLamborghini(new Lamborghini(1967, "MIURA", 367.3, true));
        carlot1.addLamborghini(new Lamborghini(1968, "espada", 368.3, false));
        carlot1.addLamborghini(new Lamborghini(1969, "islero", 369.3, true));
        carlot1.addLamborghini(new Lamborghini(1970, "jarama", 370.3, false));
        carlot1.addLamborghini(new Lamborghini(1971, "urraco", 371.3, false));
        carlot1.addLamborghini(new Lamborghini(1971, "urraco", 371.3, false));
        carlot1.addLamborghini(new Lamborghini(1973, "countache", 373.3, false));
        carlot1.addLamborghini(new Lamborghini(1974, "silhouette", 374.3, false));
        carlot1.addLamborghini(new Lamborghini(1975, "jalpa", 375.3, true));
        carlot1.addLamborghini(new Lamborghini(1976, "silhouette", 476.3, false));
        carlot1.addLamborghini(new Lamborghini(1977, "silhouette", 377.3, true));
        carlot1.addLamborghini(new Lamborghini(1978, "countache", 478.3, false));
        carlot1.addLamborghini(new Lamborghini(1978, "countache", 578.3, false));
        carlot1.addLamborghini(new Lamborghini(1978, "countache", 378.3, true));
        carlot1.addLamborghini(new Lamborghini(1979, "silhouette", 479.3, false));
        
        //Create the second car lot
        LamborghiniCarLot carlot2 = new LamborghiniCarLot();
        
        carlot2.setLotName("Taylor's brand new lambos.");
        
        carlot2.addLamborghini(new Lamborghini(2006, "gallardo", 506.3, true));
        carlot2.addLamborghini(new Lamborghini(2007, "gallardo", 507.3, true));
        carlot2.addLamborghini(new Lamborghini(2008, "reventon", 308.3, false));
        carlot2.addLamborghini(new Lamborghini(2008, "reventon", 508.3, true));
        carlot2.addLamborghini(new Lamborghini(2009, "gallardo", 409.3, true));
        carlot2.addLamborghini(new Lamborghini(2010, "murcielago", 310.3, false));
        carlot2.addLamborghini(new Lamborghini(2011, "aventador", 411.3, false));
        carlot2.addLamborghini(new Lamborghini(2012, "sesto elemento", 512.3, true));
        
        //Add them to the arraylist
        carLots.add(carlot1);
        carLots.add(carlot2);

    }
    
    /**
     * mutator for dealershipGroupName
     * @param name. String. the name for the dealership. Can't be null or empty
     */
    public void setDealershipGroupName(String name)
    {
        if(name == null || name.length()<MIN_STRING_LENGTH)
        {
            throw new IllegalArgumentException("Please enter a name for the dealership group");
        }
        
        this.dealershipGroupName = name;
    }
    
    /**
     * mutator for carLots
     * @param lot. Array List of LamborghiniCarLots. Can't be null. 
     */
    public void setCarLots(ArrayList<LamborghiniCarLot> lot)
    {
        if(lot == null)
        {
            throw new IllegalArgumentException("please provide a lot");
        }
        
        carLots = lot;
    }
    
    /**
     * accessor for dealershipGroupName
     * @return dealershipGroupName 
     */
    public String getDealershipGroupName()
    {
        return dealershipGroupName;
    }
    
    /**
     * accessor for carLots
     * @return carLots
     */
    public ArrayList<LamborghiniCarLot> getCarLots()
    {
        return carLots;
    }
    
    /**
     * adds the provided carLot to the array list
     * @param carLot LamborghiniCarLot object. Won't be added if null
     */
    public void addCarLot(LamborghiniCarLot carLot)
    {
        if (carLot != null)
        {
            carLots.add(carLot);
        }
    }
    
    public int getTotalInventoryCount()
    {
        if(carLots == null)
        {
            return 0;
        }
        
        int carTotal = 0;
        
        for(int i=0;i<carLots.size();i++)
        {
            ArrayList<Lamborghini> temp = carLots.get(i).getInventory();
            
            for(Lamborghini lambo : temp)
            {
                if(lambo == null)
                {
                    continue;
                }else
                {
                    carTotal++;
                }
                
                
            }
        }
        return carTotal;
        
    }
    
    /**
     * checks if a model exists in any of the car lots
     * @param modelName String. The model you're looking for. Can't be null or empty.
     * @return true if the model exists or false otherwise
     */
    public boolean hasModelName(String modelName)
    {
        if(carLots == null)
        {
            return false;
        }
        
        for(int i=0;i<carLots.size();i++)
        {
            ArrayList<Lamborghini> temp = carLots.get(i).getInventory();
            
            for(Lamborghini lambo : temp)
            {
                if(lambo.getModelName().equalsIgnoreCase(modelName))
                {
                    return true;
                }    
            }
        }
        
        return false;
    }
    
    /**
     * creates an array of all the car lots whose average HP for a given year
     * is within the specified range
     * @param modelYear int. The year you're looking for. Needs to be between OLDEST_MODEL_YEAR 
     * and CURRENT_YEAR
     * @param lowHP. double. The lowest Hp in the range. Needs to be between MIN_HP and MAX_HP
     * @param highHP double. The highestHP in the range. Needs to be higher than lowHP. Needs to be between MIN_HP and MAX_HP
     * @return result[] LamborghiniCarLot[] with the resulting cars.
     */
    public LamborghiniCarLot[] getAllCarLotsWithAverageHorsepowerInRangeForYear
    (int modelYear, double lowHP, double highHP)
    {
        if(modelYear < OLDEST_MODEL_YEAR || modelYear > CURRENT_YEAR)         
        {
            throw new IllegalArgumentException("Please enter a year between " + OLDEST_MODEL_YEAR + " and " + CURRENT_YEAR);            
        }
        
        if(lowHP < MIN_HP || lowHP > MAX_HP || highHP < MIN_HP || highHP > MAX_HP)
        {
            throw new IllegalArgumentException("Please enter a HP value between " + MIN_HP + " and " + MAX_HP);
        }
        
        if(highHP <= lowHP)
        {
            throw new IllegalArgumentException("This value needs to be higher than the previous one");
        }
        
        ArrayList<LamborghiniCarLot> lambos = new ArrayList<LamborghiniCarLot>();
        
        for(LamborghiniCarLot test : carLots)
        {
            if(test.getAverageHorsepowerOfYear(modelYear) > lowHP && test.getAverageHorsepowerOfYear(modelYear) < highHP) 
            {
                lambos.add(test);    
            }
        }
        
        LamborghiniCarLot[] result = new LamborghiniCarLot[lambos.size()];
        result = lambos.toArray(result);
        
        return result;
        
    }
    
    




}
















