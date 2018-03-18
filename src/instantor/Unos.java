package instantor;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class Unos {
    
    public Integer getNumberOfTests(int num){
        boolean a = false;
        Integer numberOfTests = 0;
        while(!a){
            try {
                numberOfTests = Integer.parseInt(JOptionPane.showInputDialog(null, "Unesi broj Testova!"));
                switch(num){
                    case Zadatak1.BROJ_ZADATKA:
                        if(numberOfTests>0 && numberOfTests<11){
                            a = true;
                        }else{
                            JOptionPane.showMessageDialog(null, "Broj mora biti u intervalu 1<= broj testova <= 10");
                        }
                        break;
                    case Zadatak2.BROJ_ZADATKA:
                        if(numberOfTests>0 && numberOfTests<1001){
                            a = true;
                        }else{
                            JOptionPane.showMessageDialog(null, "Broj mora biti u intervalu 1<= broj testova <= 1000");
                        }
                        break;
                    case Zadatak3.BROJ_ZADATKA:
                        if(numberOfTests>0 && numberOfTests<101){
                            a = true;
                        }else{
                            JOptionPane.showMessageDialog(null, "Broj mora biti u intervalu 1<= broj testova <= 100");
                        }
                        break;
                    case Zadatak3Bonus.BROJ_ZADATKA:
                        if(numberOfTests>0 && numberOfTests<11){
                            a = true;
                        }else{
                            JOptionPane.showMessageDialog(null, "Broj mora biti u intervalu 1<= broj testova <= 10");
                        }
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Neispravan format broja");
            }
        }
        return numberOfTests;
    }
    
    public Integer getNumberOfElements(int num){
        boolean a = false;
        Integer numberOfTests = 0;
        while(!a){
            try {
                numberOfTests = Integer.parseInt(JOptionPane.showInputDialog(null, "Unesi broj elemenata!"));
                switch(num){
                    case Zadatak1.BROJ_ZADATKA:
                        if(numberOfTests>0){
                            a = true;
                        }else{
                            JOptionPane.showMessageDialog(null, "Broj mora biti u veci od 1");
                        }
                        break;

                    case Zadatak3.BROJ_ZADATKA:
                        if(numberOfTests>0 && numberOfTests<21){
                            a = true;
                        }else{
                            JOptionPane.showMessageDialog(null, "Broj mora biti u intervalu 1<= broj testova <= 20");
                        }
                        break;

                    case Zadatak3Bonus.BROJ_ZADATKA:
                        if(numberOfTests>0 && numberOfTests<501){
                            a = true;
                        }else{
                            JOptionPane.showMessageDialog(null, "Broj mora biti u intervalu 1<= broj testova <= 500");
                        }
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Neispravan format unosa");
            }
        }
        return numberOfTests;
    }
    
    
}
