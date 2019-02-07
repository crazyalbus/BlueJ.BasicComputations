 
// Write a program that reads in two numbers between 0 and 65535, 
// stores them in short variables, and computes their unsigned sum, 
// difference, product, quotient, and remainder, without converting 
// them to int.

public class ShortCalculator {
    
    //fields
    
    private short num1;
    private short num2;
    
    //constructors
    
    public ShortCalculator (short input1, short input2)
    {
        num1 = input1;
        num2 = input2;
    }

    
    //methods
    
        //calc sum
    public short calcSum ()
    {
        return (short) Math.abs(num1 + num2);
    }
        // calc difference
    public short calcDifference ()
    {
        return (short) Math.abs(num1 - num2);
    }        
        // calc product
    public short calcProduct ()
    {
        return (short) Math.abs(num1 * num2);
    }        
        // calc quotient
    public short calcQuotient ()
    {
        return (short) Math.abs(num1 / num2);
    }        
        // calc remainder
    public short calcRemainder ()
    {
        return (short) Math.abs(num1 % num2);
    }
}
