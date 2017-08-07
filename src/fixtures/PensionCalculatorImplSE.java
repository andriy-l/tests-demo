package fixtures;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PensionCalculatorImplSE implements IpensionCalculator{
    public static final double BASIC_PENSION = 100;

    public double pensionCalculate(double stepUpCoefficient) {
        return BASIC_PENSION * stepUpCoefficient;
    }

    public double stepUpCoefficientCalculate(int averageChilds) throws TooMuchChildrensException {
        double stepUpCoefficient;
        switch (averageChilds) {

            case 3:
                stepUpCoefficient = 1;
                break;

            case 4:
                stepUpCoefficient = 1.3;
                break;

            case 5:
                stepUpCoefficient = 1.5;
                break;

            case 8:
                stepUpCoefficient = 2;
                break;

            case 10:
                throw new TooMuchChildrensException("You is a hero!: " + averageChilds);

            default:
                stepUpCoefficient = 0;
        }
        return stepUpCoefficient;
    }
    public void writeResult(File f) throws IOException {
        FileWriter fw = new FileWriter(f);
        fw.append(this.toString());
        fw.flush();
        fw.close();
    }

}

