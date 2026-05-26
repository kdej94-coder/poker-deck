/**
 * Clase Card que representa una carta de poker individual.
 */
public class Card {
    // Atributos de la carta (Palo, Color y Valor)
    private String palo;
    private String color;
    private String valor;

    /**
     * Constructor para inicializar una carta con su palo, color y valor específicos.
     */
    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    // Métodos Getters para acceder a los atributos desde otras clases
    public String getPalo() {
        return palo;
    }

    public String getColor() {
        return color;
    }

    public String getValor() {
        return valor;
    }

    /**
     * Sobreescritura del método toString para darle el formato requerido al imprimir la carta.
     * Formato: {Palo},{Color},{Valor}
     */
    @Override
    public String toString() {
        return palo + "," + color + "," + valor;
    }
}
