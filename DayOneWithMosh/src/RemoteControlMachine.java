public class RemoteControlMachine {

    /**
     * Declaring main variables
     */
    private double speed;
    private double price ;
    private String condition ;
    private String model;
    private boolean status ;
    /**
     * Create a constructor for speed
     * and status
     * @param speed
     * @param status
     * @param model
     * @param condition
     */
    public void RemoteControlMachine(double speed,boolean status , String model , double price ,
    String condition){
        this.speed = speed ;
        this.status = status ;
        this.model = model ;
        this.price = price ;
        this.condition =condition ;
    }
    /**
     * Set Setters and Getters
     * @return
     */
    public double getSpeed (){
        return speed ;
    }
    public void setSpeed (double speed){
        this.speed = speed ;
    }
    public boolean getStatus (){
        return status ;
    }
    public void setStatus (boolean status){
        this.status = status ;
    }
    public String getModel (){
        return model ;
    }
    public void setModel (String model){
        this.model = model ;
    }
    public double getPrice (){
        return price ;
    }
    public void setPrice (double price){
        if (price >= 1000 )
            throw new IllegalArgumentException("It's too expensive ");

        this.price = price ;
    }
}
