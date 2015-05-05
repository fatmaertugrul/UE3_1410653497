package Aufgabe4;

public class Aufruf {
     
    public static void main(String[] args)
    {
     Liste a = new Liste(2);
     a.save(2.5);
     a.save(5.0);
     a.save(200.0);
     
     System.out.println(a.toString());
     
    }   
}
