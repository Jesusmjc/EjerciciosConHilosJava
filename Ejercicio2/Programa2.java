package Ejercicio2;

public class Programa2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ImpresorMensajes("Hola"));
        Thread thread2 = new Thread(new ImpresorMensajes("Mundo"));
        thread1.start();
        thread2.start();
    }
}
