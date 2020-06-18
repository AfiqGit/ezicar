package ezcar.backend.Model;

public class Car {
    
    private int carId;
    private String carName;
    private String carType;
    private String carStatus;
    private float carPrice;


    public Car(int carId, String carName, String carType, String carStatus, float carPrice){
        this.carId = carId;
        this.carName = carName;
        this.carType = carType;
        this.carStatus = carStatus;
        this.carPrice = carPrice;
    }

    public void setCarId(int carID){
        this.carId= carID;
    }

    public void setCarName(String carName){
        this.carName= carName;
    }

    public void setCarType(String carType){
        this.carType= carType;
    }

    public void setCarStatus(String carStatus){
        this.carStatus= carStatus;
    }

    public void setCarPrice(float carPrice){
        this.carPrice= carPrice;
    }

    public int getCarId(){
        return carId;
    }

    public String getCarName(){
        return carName;
    }

    public String getCarType(){
        return carType;
    }

    public String getCarStatus(){
        return carStatus;
    }

    public float getCarPrice(){
        return carPrice;
    }
}