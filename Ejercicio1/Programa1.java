package Ejercicio1;

public class Programa1 {
    public static void main(String[] args) {
        // Crear e iniciar los hilos
        Thread thread1 = new Thread(new SecuenciaNumeros("Hilo 1", 1, 100, 1));
        Thread thread2 = new Thread(new SecuenciaNumeros("Hilo 2", 100, 1, -1));
        thread1.start();
        thread2.start();
    }
}