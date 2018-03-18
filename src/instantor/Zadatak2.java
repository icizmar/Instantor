package instantor;

/**
 *
 * @author Ivan
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Zadatak2 {

    private Unos unos;
    ArrayList<Rijec> rijeci;
    public static final int BROJ_ZADATKA = 2;
    private Integer brojTestova;

    public static void main(String[] args) {
            new Zadatak2();
    }

    public Zadatak2() {
        rijeci = new ArrayList<>();
        unos = new Unos();
        unos();
        rjesi();
    }

    private void unos() {
            brojTestova = unos.getNumberOfTests(BROJ_ZADATKA);
            System.out.println(brojTestova);
            int counter = 0;

            while (brojTestova > 0) {
                    unosRijeci(counter);
                    brojTestova--;
                    counter++;
            }
    }

    private void unosRijeci(int poljeNumber) {
            String rijec = JOptionPane.showInputDialog(null, "Unesi riječ S");
            rijeci.add(new Rijec(rijec));
    }

    private void rjesi() {
            for (Rijec rijec : rijeci) {
                    System.out.println(rijec.findSubsequence() ? "yes" : "no");
            }
    }
}
