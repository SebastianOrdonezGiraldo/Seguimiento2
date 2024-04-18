package Trasporte;

public class Main {
    public static void main(String[] args) {
        for (Transporte transporte : Transporte.values()) {
            System.out.println("Medio de transporte: " + transporte);
            System.out.println("Capacidad: " + transporte.getCapacidad());
            System.out.println("Tipo de motor: " + transporte.getTipoMotor());
            transporte.mostrarDescripcion();
            System.out.println();
        }
    }
}
