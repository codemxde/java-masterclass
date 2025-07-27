public public class DecimalComparator {
    // write code here
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 *= 1000; num2 *= 1000;
        
        num1 = num1 > 0 ? Math.floor(num1) : Math.ceil(num1);
        num2 = num2 > 0 ? Math.floor(num2) : Math.ceil(num2);
        
        return num1 == num2;
        
    }

}{

}
