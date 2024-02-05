package com.mycompany.app;

public class AccessModifiers {

    public static void main(String[] args) {
        Car car=new Car("AWD", "SUV", "Toyota", "RAV4", 2023);
        car.displayDriveType();
        car.diplayDetails();
        //we cant access the Mnufacturer and Drivetype as they are private and protected
    }
    
}


class Vehicle {
// Private member: Only accessible within the Vehicle class
private String Drivetype;
// Protected member: Accessible within the Vehicle class, its subclasses, and within the same package
protected String Manufacturer;
// Default access modifier (package-private): Accessible within the same package
String Model;
// Public member: Accessible from any other class
public int Year;

public Vehicle(String Drivetype){
this.Drivetype=Drivetype;
}

public String getDriveType(){
    return Drivetype;
}
//only access within the subclass
protected void displayDriveType(){
    System.out.println("The vehilce is AWD/FWD "+ Manufacturer);
}

    
}

//inherits the parent class
class Car extends Vehicle{

    private String carType;

    public Car(String Drivetype,String carType,String Manufacturer,String Model,int Year) {
        super(Drivetype);
        this.carType=carType;//accessing the private within the class.
        this.Manufacturer=Manufacturer;//accessing proptected attibute
        this.Model=Model;//accesing the default access
        this.Year=Year;//accessing the public 
       
    }

    public void diplayDetails(){
        System.out.println("The vehicle type:"+ carType);
        System.out.println("The vehicle year:"+Year);
        System.out.println("The vehicle Manufacturer:"+Manufacturer);
        System.out.println("The vechicle display method:"+getDriveType());

    }
    
}
