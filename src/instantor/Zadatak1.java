package instantor;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class Zadatak1 {

    public static final int BROJ_ZADATKA = 1;
    private Integer brojTestova;
    private Integer N;
    private Polje1[] polja;
    private Unos unos;
    
    public Zadatak1(){
        unos = new Unos();
        unos(); 
        racunTestova();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Zadatak1();
    }
    
    private void unos() {
        brojTestova = unos.getNumberOfTests(BROJ_ZADATKA);
        polja = new Polje1[brojTestova];
        int counter = 0;
        
        while( brojTestova > 0) {
            unosBrojaElemenata(counter);
            brojTestova--;
            counter++;
        } 
    }
    
    private void unosBrojaElemenata(int poljeNumber) {
        System.out.println("Unesi broj elemenata");
        N = unos.getNumberOfElements(BROJ_ZADATKA);
        String line = JOptionPane.showInputDialog(null, "Unesi elemente");
        String znakoviBrojeva[] = line.split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            try{
                A[i] = Integer.parseInt(znakoviBrojeva[i]);
            }catch(Exception e){
                System.out.println("Neispravno unesen element");
                A[i]=0;
            }
        }   
         polja[poljeNumber] = new Polje1(A);
    }
    
    private void racunTestova() {
    	int length = polja.length;
    	for(int i = 0; i < length; ++i) {
    		 System.out.println("Minimum jest:" + polja[i].getMinimumSumIndex());
    	}
    }
}