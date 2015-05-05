package Aufgabe3;

public class Car extends Vehicle{
    private boolean aircondition;
    private short airbag;

    public Car(short wheels, Color farbe, short ps, short doors, short airbag) {
        super(wheels, farbe, ps, doors, false, (short)0);
        this.airbag = airbag;
        aircondition = false;
        
    }
    public Car(){
        
    }
    
    void startAircondition(){
        if(aircondition == false){
            aircondition = true;
        }
        else if(aircondition == true){
            System.out.println("Klimaanlage läuft bereis!");
        }
    }
    
    void stopAircondition(){
        if(aircondition == true){
            aircondition = false;
        }
        else if(aircondition == false){
            System.out.println("Klimaanlage ist bereis aus!");
        }
    }

    public boolean isAircondition() {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }

    @Override
    public String toString() {
        return "Mein Auto hat " + getPs() + " PS und fähr mit " + getSpeed() + " km/h.";
    }
    
    
    
}
