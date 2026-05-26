/**
 * Clase Main, punto de entrada del programa para ejecutar y probar el Deck.
 */
public class Main {
    public static void main(String[] args) {
        // 1. Se crea un nuevo objeto Deck (esto automáticamente genera las 52 cartas por dentro)
        Deck deck = new Deck();
        
        // 2. Se llama al método para mezclar la baraja
        System.out.println("----- PRUEBA SHUFFLE -----");
        deck.shuffle();
        
        // 3. Se prueba sacar la primera carta
        System.out.println("\n----- PRUEBA HEAD -----");
        deck.head();
        
        // 4. Se prueba sacar una carta al azar
        System.out.println("\n----- PRUEBA PICK -----");
        deck.pick();
        
        // 5. Se prueba sacar una mano completa (5 cartas seguidas)
        System.out.println("\n----- PRUEBA HAND -----");
        deck.hand();
    }
}
