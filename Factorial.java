 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        
        BigInteger total = new BigInteger("1");
        
        for (int i = value; i > 0; i--) {
            total = total.multiply(BigInteger.valueOf(i));
        }
    
        return total;
}
}