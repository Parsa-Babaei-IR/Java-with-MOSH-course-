public class RemoteControlMachine {

    /**
     * Declaring main variables
     */
    private double speed;
    private float price ;
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
    public void RemoteControlMachine(double speed, float price , String model , String condition
            , boolean status ){
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
    double getSpeed(){
        return speed ;
    }

    /**
     * We through an error for illegal arguments
     * Also we specify each error with specific message
     * @param speed
     */
    public void setSpeed (double speed){
        if (speed >= 60 )
            throw new IllegalArgumentException("This speed in not legal for street race");
        this.speed = speed ;
    }
    public boolean getStatus (){
        return status ;
    }
    public void setStatus (boolean status){
        if (status == false )
            throw new IllegalArgumentException("Please turn on your RC Machine");
        this.status = status ;
    }
    public String getModel (){
        return model ;
    }
    public void setModel (String model){
        if (model == "Battery ")
            throw new IllegalArgumentException("Your RC machine is run by Battery we" +
                    "just accept Nitro Model");
        this.model = model ;
    }
    public float getPrice (){
        return price ;
    }
    public void setPrice (float price){
        if (price >= 1000 )
            throw new IllegalArgumentException("It's too expensive ");
        this.price = price ;
    }

}
