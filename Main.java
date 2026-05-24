public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        
        System.out.println("----- PRUEBA SHUFFLE -----");
        deck.shuffle();
        
        System.out.println("\n----- PRUEBA HEAD -----");
        deck.head();
        
        System.out.println("\n----- PRUEBA PICK -----");
        deck.pick();
        
        System.out.println("\n----- PRUEBA HAND -----");
        deck.hand();
    }
}
