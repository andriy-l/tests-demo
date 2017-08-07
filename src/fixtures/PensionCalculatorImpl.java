package fixtures;


public class PensionCalculatorImpl implements IpensionCalculator{
    public static final double BASIC_PENSION = 100;
    public double pensionCalculate(double stepUpCoefficient) {
        return BASIC_PENSION * stepUpCoefficient;
    }
}

