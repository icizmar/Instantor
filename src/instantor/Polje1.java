package instantor;

/**
 *
 * @author Ivan
 */
public class Polje1 {
    
    private int[] myArray;
    private int[] sufiks;
    private int[] prefix;
    private int[] sum;

    public Polje1(int[] myArray) {
        this.myArray = myArray;
        sufiks = new int[myArray.length];
        prefix = new int[myArray.length];
        sum = new int[myArray.length];
        fillSufiks();
        fillPrefiks();
        calcSum();
    }

    private void fillSufiks() {
        int length = myArray.length;
        for(int i = 0; i < length; ++i) {
            for(int j = i; j < length; ++j) {
                sufiks[i] += myArray[j];
            }
        }
    }

    private void fillPrefiks() {
        int length = myArray.length;
        for(int i = length - 1; i >= 0; --i) {
            for(int j = i; j >= 0; --j) {
                prefix[i] += myArray[j];
            }
        }
    }

    private void calcSum() {
        int length = myArray.length;
        for(int i = 0; i < length; ++i) {
            sum[i] = sufiks[i] + prefix[i];
        }
    }

    public int getMinimumSumIndex() {
        int length = myArray.length;
        int minimum = sum[0];
        int minIndex = 0;
        for(int i = 0; i < length; ++i) {
            if(minimum > sum[i]) {
                minimum = sum[i];
                minIndex = i;
            }
        }
        return minIndex + 1;
    }
}
