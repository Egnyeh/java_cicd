package dam.optativa;

public class DiscountCalculator {
    public static double calculate(double price, boolean isStudent) {
        if(isStudent) {
            return price * 0.80
        } else {
            return price * 0.95
        }
    }

    public static void main(String[] args) {
        System.out.println("Precio para estudiante (100€): " + calculate(100, true))
        System.out.println("Precio para no estudiante (100€): " + calculate(100, false));
    }
}
