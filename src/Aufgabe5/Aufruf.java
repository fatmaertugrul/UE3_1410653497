package Aufgabe5;

public class Aufruf {

    public static void main(String[] args) {
        
     Liste<Benennbar> l =  new Liste(3);
     Benennbar a = new Car();
     Benennbar b = new Boat();
     Benennbar c = new Vehicle();
     
     l.save(a);
     l.save(b);
     l.save(c);
     
     System.out.println(a.toString());
    }
    
}
