package com.mycompany.app;

public class OopsConcepts {
  // Encapsulation: Use "class" to encapsulate data (fields) and methods to operate on the data
    public static class Car {
    // Private fields - Encapsulation
    private String Manufacturer;
    private String BodyType;

    // Constructor
   public Car(String Manufacturer,String BodyType)
   {
    this.BodyType=BodyType;
    this.Manufacturer=Manufacturer;
   }    

   // Public getter methods to access private fields
    public String getManufacturer()
    {
    return Manufacturer;
    }

    public String getBodyType()
    {
    return BodyType;
    }

    // Method to demonstrate behavior
    public void getCar(){
        System.out.println("Basic details of car");
    }

    }

    // Inheritance Carspecifications extends the car
    public static class CarSpecifications extends Car{

        private String Color;
        private int Transmission;

        public CarSpecifications(String Manufacturer, String BodyType, String Color,int Transmission) {
            super(Manufacturer, BodyType);
            this.Color=Color;
            this.Transmission=Transmission;
            //TODO Auto-generated constructor stub
        }

        @Override
        public void getCar() {
            // TODO Auto-generated method stub
            System.out.println("This car bodyColor:" + Color);;
        }     
    }

    /**
     * Abstraction: This interface represents a high-level contract for Car specifications without implementation
     */
    public interface VehicleType{
        void vechicleType();
        
    }
    // Implementing the VechilceType interface and extending CarSpecifications, demonstrating both abstraction and polymorphism
    public static class Toyota extends CarSpecifications implements VehicleType {

        public Toyota(String Manufacturer, String BodyType, String Color, int Transmission) {
            super(Manufacturer, BodyType, Color, Transmission);
            //TODO Auto-generated constructor stub
        }

        @Override
        public void vechicleType() {
         System.out.println("This is a mileage focused Hybrid sedan");
        }
    
        
    }
    


    public static void main(String[] args) {
         Toyota toyota= new Toyota("Lexus", "Sedan", "Black", 2);
         toyota.getCar();
         toyota.getBodyType();
         toyota.vechicleType();
    }
}
