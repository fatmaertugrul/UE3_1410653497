package Aufgabe3;

public class Vehicle extends Benennbar{
    
    private short wheels;
    public enum Color{
        BLACK, SILVER, RED, GREY, YELLOW, BLUE
    }
    private short ps;
    private short doors;
    private boolean started;
    private short speed;
    private Color farbe;

    public Vehicle(short wheels, Color farbe, short ps, short doors, boolean started, short speed) {
        this.wheels = wheels;
        this.ps = ps;
        this.doors = doors;
        this.started = started;
        this.speed = speed;
        this.farbe = farbe;
    }
    
    public Vehicle(){
        
    }
    
    void start(){
        started = true;
    }
    
    void stop(){
        started = false;
    }
    
    void accelerate(short speed){
        if(speed == 250){
            speed = 250;
        }
        if(started == true){
        this.speed += speed;
        }
        
    }
    
    void bremsen(short speed){
        if(speed == 0){
            speed = 0;
        }
        if(started == true){
        this.speed -= speed;
        }
    }

    public short getWheels() {
        return wheels;
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getDoors() {
        return doors;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public Color getFarbe() {
        return farbe;
    }

    public void setFarbe(Color farbe) {
        this.farbe = farbe;
    }
    
    
}
