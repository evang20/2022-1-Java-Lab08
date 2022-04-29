package edu.handong.csee.java.hw2.math;

/**This is the MathCalculator Class */
public class MathCalculator {
    /**This is the Math Calculator Class. Within this class, the methods of the calculator functions 
    * are created and called upon in the MathDriver.java file. 
    */

    /**A private String for variable "name" is created for the get and set method of name.*/
    private String name;

    /**Set method for name */
    public void setName(String newValue){
        name = newValue;
    }

    /**Get method for name */
    public String getName(){
        return name;
    }

    /**Get method for Max number*/
    public int getMax(int x, int y){
        if (x < y)
            return y;
        else 
            return x;
    }

    /**Get method for Min value*/
    public int getMin(int a, int b){
        if (a > b)
            return b;
        else 
            return a;
    }

    /**Get method for absolute value*/
    public int getAbs(int absoluteValue){
        if (absoluteValue < 0)
            return absoluteValue = absoluteValue * -1;
        else
            return absoluteValue;
    }

    /**Get method for Summation of two numbers*/
    public int getSum(int x, int y){
        return (x + y);
    }

    /**Get method for Difference of two numbers*/
    public int getDiff(int x, int y){
        return (x - y);
    }

    /**get method for Product of two numbers*/
    public int getProduct(int x, int y){
        return (x * y);
    }

    /**Get method for Quotient of two numbers*/
    public int getQuotient(int x, int y){
        return (x / y);
    }

    /**Get method for Remainder of two numbers*/
    public int getRemainder(int a, int b){
        return (a % b);
    }

    /**Get method for value of x^y*/
    public int getPower(int x, int y){
        int result = 1;
        int i;
        for (i = 0; i < y; i++)
        {
            result = result * x;
        }
        return result;
    }

    /**Get method for Factorial of a number*/
    public int getFactorial(int exp){
        int i;
        int factorial = 1;
        for (i = 1; i <= exp; i++)
        {
            factorial = factorial * i;
        }
        return factorial;
    }

     /**Get method for GCD of two numbers*/
    public int getGcd(int x, int y) {   
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++)
        {
            if (x % i == 0 && y % i == 0)
            {
                gcd = i;
            }
        }
        return gcd;  
    }

     /**Get method for LCM of two numbers*/
    public int getLcm(int x, int y) {
        if (x == 0 || y == 0)
            return 0;
        else {
            return ((x*y)/(getGcd(x, y)));
        }
    }

    /**Get method for Square of a number*/
    public int getSquare(int x) {
        return (x * x);
    }
}