package Ejercicio2;

public class ImpresorMensajes implements Runnable {
    private String mensaje;

    public ImpresorMensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        while (true) {
            System.out.print(mensaje + " ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
