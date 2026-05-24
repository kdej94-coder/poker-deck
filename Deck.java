import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    // 1. Atributo tipo Collection para las cartas disponibles
    private ArrayList<Card> cartas;
    // 2. Atributo tipo Collection para las cartas que ya salieron del deck (removidas)
    private ArrayList<Card> cartasRemovidas;

    public Deck() {
        cartas = new ArrayList<>();
        cartasRemovidas = new ArrayList<>();
        inicializarDeck();
    }

    private void inicializarDeck() {
        String[] palos = {"tréboles", "corazones", "picas", "diamantes"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String palo : palos) {
            String color = (palo.equals("corazones") || palo.equals("diamantes")) ? "rojo" : "negro";
            for (String valor : valores) {
                cartas.add(new Card(palo, color, valor));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cartas);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (cartas.isEmpty()) {
            System.out.println("No quedan cartas en el deck");
            return;
        }
        Card c = cartas.remove(0); // Remueve la primera carta
        cartasRemovidas.add(c);
        System.out.println(c.toString());
        System.out.println("Quedan " + cartas.size() + " en deck");
    }

    public void pick() {
        if (cartas.isEmpty()) {
            System.out.println("No quedan cartas en el deck");
            return;
        }
        Random rand = new Random();
        int index = rand.nextInt(cartas.size()); // Índice aleatorio
        Card c = cartas.remove(index);
        cartasRemovidas.add(c);
        System.out.println(c.toString());
        System.out.println("Quedan " + cartas.size() + " en deck");
    }

    public void hand() {
        if (cartas.size() < 5) {
            System.out.println("No hay suficientes cartas para una mano.");
            return;
        }
        for (int i = 0; i < 5; i++) {
            Card c = cartas.remove(0);
            cartasRemovidas.add(c);
            System.out.println(c.toString());
        }
        System.out.println("Quedan " + cartas.size() + " en deck");
    }
}
