 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int largest;
        
        if (integers[0] - integers[1] <= 0) {
            largest = integers[1];
        } else {largest = integers[0];
        }
        
        if (largest - integers[2] <= 0) {
            largest = integers[2];
        }
       
        return largest;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int largest;
        
        largest = Math.max(integers[0], integers[1]);
        largest = Math.max(largest, integers[2]);
        return largest;
    }
}
