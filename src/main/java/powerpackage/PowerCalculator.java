package powerpackage;

public class PowerCalculator {
    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        int result = 1;
        
        boolean isNegativeExponent = exponent < 0;
        if (isNegativeExponent) {
            exponent = -exponent;
        }
        
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        
        if (isNegativeExponent) {
            return 1 / result;
        }

        return result;
    }
}
