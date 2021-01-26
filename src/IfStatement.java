public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnable = true;
        int counter = 0;
        if (isBluetoothEnable) {
            counter++;
            System.out.println("El bluetooth esta encendido");
        } else {
            System.out.println("El bluetooth esta apagado");
        }

        System.out.println(isBluetoothEnable);
        System.err.println(counter);
    }
}
