package instantor;

import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class Zadatak3 {
    
    public static final int BROJ_ZADATKA = 3;
    private static Set<Integer> tree = new TreeSet<Integer>();
    private int brojTestova; 
    private int brojKeksa;
    private int zahtjevAdmina;
    private Boolean[] rezultati;
    private int[] A;
    private Unos unos;
    
    public Zadatak3(){
        unos = new Unos();
        unos();
        ispis();
    }
            
    public static void main(String args[]) {
        new Zadatak3();
    }
//algoritam preuzet s https://stackoverflow.com/questions/10307150/in-java-how-to-get-all-possible-distinct-sums-in-an-array
    public static void getAllSum(int[] numbersArray, int starting, int sum)
    {   
        if(numbersArray.length == starting)
        {      
            tree.add(sum);    
            return;
        }
        int value = sum + numbersArray[starting];
        getAllSum(numbersArray, starting + 1, value);
        getAllSum(numbersArray, starting + 1, sum); 
    }

    private void unos() {
        brojTestova = unos.getNumberOfTests(BROJ_ZADATKA);
        rezultati = new Boolean[brojTestova];
        int counter = 0;
        while(brojTestova>0){
            brojKeksa = Integer.parseInt(JOptionPane.showInputDialog(null, "Unesi broj keksa"));
            System.out.print(brojKeksa + " ");
            zahtjevAdmina = Integer.parseInt(JOptionPane.showInputDialog(null, "Kolko traže server administratori"));
            System.out.print(zahtjevAdmina);
            System.out.println();
            A = new int[brojKeksa];
            for (int i = 0; i < brojKeksa; i++) {
                A[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Unesi težinu keksa")); 
            }
            for (int j = 0; j < brojKeksa; j++) {
                System.out.print(A[j] + " ");
            }
            System.out.println();
            getAllSum(A,0,0);
            tree.remove(0);
            Integer a = zahtjevAdmina;
            rezultati[counter] = tree.contains(a);
            tree.clear();
            counter++;
            brojTestova--;
        }
    }

    private void ispis() {
        for (Boolean b : rezultati) {
            System.out.println(b ? "yes" : "no");
        }
    }
    
}
    

