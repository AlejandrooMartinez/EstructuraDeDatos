
package hilos;


class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo en ejecucion: " + i);
            try {
                Thread.sleep(500); // Pausa de 500 ms
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido.");
            }
        }
    }
}

public class Hilos {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable, "Hilo-1");
        myThread.start();
    }
}

