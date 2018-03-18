package instantor;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class Zadatak3Bonus {
    
    public static final int BROJ_ZADATKA = 4;
    private Integer[] A;
    private Polje3[] array;
    private Integer brojTestova;
    private Integer T;
    private Integer N;
    private Unos unos;
    
    
    public Zadatak3Bonus(){
        unos = new Unos();
        unos();
        ispis();
    }
    
    public static void main(String[] args) {
        new Zadatak3Bonus();
    }
    
    
    
    private void ispis() {
        for (int i = 0; i < T; i++) {
            System.out.println("Poklapanje će se dogoditi na " + array[i].getMilisekunde() + " milisekundi");
        }
    }

    private void unos() {
        brojTestova = unos.getNumberOfTests(BROJ_ZADATKA);
        T = brojTestova;
        array = new Polje3[brojTestova];
        A = new Integer[brojTestova];
        int counter = 0;
        
        while( brojTestova > 0) {
            unosBrojaElemenata(counter);
            brojTestova--;
            counter++;
        } 
    }

    private void unosBrojaElemenata(int poljeNumber) {
        N = Integer.parseInt(JOptionPane.showInputDialog(null, "Unesi broj cijelih brojeva"));
        String linija = JOptionPane.showInputDialog(null, "Unesi cijele brojeve"); 
        String znakoviBrojeva[] = linija.split(" ");
        A = new Integer[N];
        for (int i = 0; i < N; i++) {
            try{
                A[i] = Integer.parseInt(znakoviBrojeva[i]);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Neispravan unos brojeva");
                A[i]=0;
            }
        }
        array[poljeNumber] = new Polje3(A);
    }
}
