//Source: https://docs.oracle.com/javase/tutorial/java/concepts/interface.html

public class Interfaces {
    public static void main(String args[]){
        ACMEBicycle b = new ACMEBicycle();
        b.printStates();
        b.ride();
    }
    
}

interface Bicycle {
    //by default interface methods are public!
    //  wheel revolutions per minute
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void applyBrakes(int decrement);

    default void ride() {
        System.out.println("Riding the bicycle.");
    }
    
}

class ACMEBicycle implements Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

   // The compiler will now require that methods
   // changeCadence, changeGear, speedUp, and applyBrakes
   // all be implemented. Compilation will fail if those
   // methods are missing from this class.

    public void changeCadence(int newValue) {
         cadence = newValue;
    }

    public void changeGear(int newValue) {
         gear = newValue;
    }

    public void speedUp(int increment) {
         speed = speed + increment;   
    }

    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}