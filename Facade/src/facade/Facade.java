package facade;

/**
 *
 * @author Pichau
 */
public class Facade {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interface interface1 = new Interface();
        interface1.autenticacao("Fulano", 325);
        interface1.autenticacao("Ciclano", 28);
    }
}