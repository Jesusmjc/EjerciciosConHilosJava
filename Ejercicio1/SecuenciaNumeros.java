package Ejercicio1;

public class SecuenciaNumeros implements Runnable {
    private String nombre;

    private int inicio;
    private int fin;
    private int paso;

    public SecuenciaNumeros(String nombre, int inicio, int fin, int paso) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.paso = paso;
    }

    public void run() {
        for (int i = inicio; i != fin + paso; i += paso) {
            System.out.println(nombre + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
