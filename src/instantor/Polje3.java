package instantor;

/**
 *
 * @author Ivan
 */
public class Polje3 {
    
    private Integer[] myArray;
    private Integer min1;
    private Integer min2;
    private Integer indeksMinimalnog;
    private Integer milisekunde;
    
    public Polje3(Integer[] myArray){
        this.myArray = myArray;
        obrada();
    }
    
    private void obrada() {
        min1 = traziMinimum();
        int max = nadiMax();
        min2 = traziSljedeciMinimum(max); 
        provjera();
    }

    private int traziMinimum() {
        int minimum = myArray[0];
        indeksMinimalnog = 0;
            for (int i = 0; i < myArray.length; i++) {
                if(myArray[i]<minimum){
                    minimum = myArray[i];
                    indeksMinimalnog = i;
                }
            }
            
        return minimum;
    }
    
    private int traziSljedeciMinimum(int max) {
        int sljedeciMinimum = max;
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i]<sljedeciMinimum && i!=indeksMinimalnog){
                sljedeciMinimum = myArray[i];
            }
        }
        return sljedeciMinimum;
    }

    private int nadiMax() {
        int max = 0;
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i]>max){
                max = myArray[i];
            }
        }
        return max;
    }
    
    private void provjera() {
        for (int i = 0; i < myArray.length; i++) {
            if(min2 % min1 == 0){
                milisekunde = min2;
                break;
            }
            if(min2 % min1 != 0){
                milisekunde = min2 * min1;
                break;
            }
            if(min1 == min2){
                milisekunde = min1;
            }
        }
    }
    
     public Integer getMilisekunde() {
        return milisekunde;
    }

    public void setMilisekunde(Integer milisekunde) {
        this.milisekunde = milisekunde;
    }
}
