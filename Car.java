public class Car{

    private String carName;
    private int milesDriven;
    private double gallonsUsed;

    public Car(){
        carName = "";
        milesDriven = 0;
        gallonsUsed = 0.0;
    }

    public Car(String carName, int milesDriven, double gallonsUsed){
        this.carName = carName;
        this.milesDriven = milesDriven;
        this.gallonsUsed = gallonsUsed;
    }
    public String getName(){return carName;}
    public String setName(String carName){return this.carName = carName;}
    public int getMiles(){return milesDriven;}
    public int setMiles(int milesDriven){return this.milesDriven = milesDriven;}
    public double getGallons(){return gallonsUsed;}
    public double setGallons(double gallonsUsed){return this.gallonsUsed = gallonsUsed;}

    public double calculateAverage(){
        double average = (double)milesDriven / gallonsUsed;
        return Math.round(average*10.0)/10.0; //check if this calcualtion is right
    }
    public String toString(){return carName + " averaged " + calculateAverage() + " m/g";};

}
