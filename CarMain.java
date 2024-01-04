class Car{
    static int noOfWheel;
    int  regNo;
    String model;
    String color;
public void startCar(){
    System.out.println("Car started");
}
public void brakeCar(){
    System.out.println("brakes applied");
}

public void printCarDetails(){
    System.out.println("RegNo: "+regNo);
    System.out.println("Model : "+model);
    System.out.println("Color : "+color);
    System.out.println("no of wheels : "+noOfWheel);
}
}
class CarMain{

    public static void main(String []args){
        Car bmw=new Car();
        bmw.regNo=4567;
        bmw.model="BMV X1";
        bmw.color="Black";
        bmw.noOfWheel=6;
   
         Car c2=new Car();
        c2.regNo=4237;
        c2.model="Audi";
        c2.color="Blue";
        c2.noOfWheel=4;
        
        bmw.printCarDetails();
        bmw.startCar();
        bmw.brakeCar();
        c2.printCarDetails();
        c2.startCar();
        c2.brakeCar();
        

    }
}