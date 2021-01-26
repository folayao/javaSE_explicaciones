public class Casting {
    public static void main(String[] args) {
        // En un años ubique 30 Perritos
        // ¿Cuantos ubique al mes?
        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs);
        // Estimación
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println("Dato Casteado: " + estimatedMonthlyDogs);
    }
}
