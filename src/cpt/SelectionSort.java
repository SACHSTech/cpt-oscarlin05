package cpt;

public class SelectionSort {
    
    /**
     * Selection sort takes in an array of doubles and returns a sorted array of the same doubles.
     */
    public void sort(Double[] percentage) {
        for (int i = 0; i < percentage.length - 1; i++) {

            int currentMinIndex = i;

            for (int j = i + 1; j < percentage.length; j++) {
                
                if (percentage[j] < percentage[currentMinIndex]) {

                    currentMinIndex = j;
                }
            }
            
            Double temp = percentage[currentMinIndex];
            percentage[currentMinIndex] = percentage[i];
            percentage[i] = temp;
        }
    }
}