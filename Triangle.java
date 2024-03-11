public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public String getType() {
        if (sideA == sideB && sideB == sideC) {
            return "Teng tomonli uchburchak";
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            return "Teng yonli uchburchak";
        } else {
            return "tomonlarining uzunliklari bir xil bo'lmagan uchburchak";
        }
    }
}