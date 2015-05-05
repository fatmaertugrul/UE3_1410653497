package Aufgabe4;

public class Liste<T> { // T- --> Platzhalter für Datentypen

    T[] array;

    public Liste(int size) {
        array = (T[]) (new Object[size]);
    }

    public void save(T element) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] == null) {
                array[i] = element;
                System.out.println("gespeichert");
                break;
            }
        }

    }

   @Override
    public String toString() {
        String listenInhalt = "";
        for (T a : array) {
            listenInhalt += a + "\n";
        }
        return listenInhalt;
    }
}