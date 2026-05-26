import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Clase Deck que representa la baraja completa de cartas.
 */
public class Deck {
    // 1. Atributo tipo Collection (ArrayList) para las cartas disponibles en el mazo
    private ArrayList<Card> cartas;
    // 2. Atributo tipo Collection (ArrayList) para almacenar las cartas que ya se repartieron/removieron
    private ArrayList<Card> cartasRemovidas;

    /**
     * Constructor del Deck. Inicializa las listas y crea las 52 cartas.
     */
    public Deck() {
        cartas = new ArrayList<>();
        cartasRemovidas = new ArrayList<>();
        inicializarDeck(); // Llama al método para llenar la baraja
    }

    /**
     * Método privado que genera las 52 cartas iterando sobre los palos y valores posibles.
     */
    private void inicializarDeck() {
        String[] palos = {"tréboles", "corazones", "picas", "diamantes"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        // Recorremos cada palo
        for (String palo : palos) {
            // Asignamos el color dependiendo del palo (corazones y diamantes son rojos)
            String color = (palo.equals("corazones") || palo.equals("diamantes")) ? "rojo" : "negro";
            
            // Recorremos cada valor para crear la carta y agregarla al mazo
            for (String valor : valores) {
                cartas.add(new Card(palo, color, valor));
            }
        }
    }

    /**
     * Método para mezclar aleatoriamente las cartas en el deck.
     */
    public void shuffle() {
        Collections.shuffle(cartas); // Usa la utilidad de Java para revolver listas
        System.out.println("Se mezcló el Deck.");
    }

    /**
     * Método para sacar la primera carta del mazo (índice 0) y mostrarla.
     */
    public void head() {
        if (cartas.isEmpty()) {
            System.out.println("No quedan cartas en el deck");
            return;
        }
        // Remueve la primera carta de la lista de cartas disponibles
        Card c = cartas.remove(0); 
        // Agrega la carta a la lista de cartas removidas
        cartasRemovidas.add(c);
        // Imprime la carta usando el formato de su método toString()
        System.out.println(c.toString());
        // Imprime la cantidad de cartas restantes
        System.out.println("Quedan " + cartas.size() + " en deck");
    }

    /**
     * Método para seleccionar y remover una carta al azar.
     */
    public void pick() {
        if (cartas.isEmpty()) {
            System.out.println("No quedan cartas en el deck");
            return;
        }
        Random rand = new Random();
        // Genera un índice aleatorio entre 0 y el tamaño actual de la lista
        int index = rand.nextInt(cartas.size()); 
        
        // Remueve la carta en esa posición aleatoria
        Card c = cartas.remove(index);
        cartasRemovidas.add(c);
        System.out.println(c.toString());
        System.out.println("Quedan " + cartas.size() + " en deck");
    }

    /**
     * Método para sacar una "mano" de 5 cartas secuenciales del mazo.
     */
    public void hand() {
        if (cartas.size() < 5) {
            System.out.println("No hay suficientes cartas para una mano.");
            return;
        }
        // Ciclo for que se repite 5 veces para sacar 5 cartas
        for (int i = 0; i < 5; i++) {
            Card c = cartas.remove(0); // Siempre saca la que queda de primero
            cartasRemovidas.add(c);
            System.out.println(c.toString());
        }
        // Imprime cuántas quedaron en total después de sacar la mano
        System.out.println("Quedan " + cartas.size() + " en deck");
    }
}
