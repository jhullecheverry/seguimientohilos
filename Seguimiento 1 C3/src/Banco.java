import java.util.concurrent.locks.ReentrantLock;

public class Banco {
        private final ReentrantLock lock = new ReentrantLock();

        public void atenderCliente(String tipoFila) {
            lock.lock();
            try {
                System.out.println("Cliente de la fila " + tipoFila + " está siendo atendido por " + Thread.currentThread().getName());
                // Simula la atención al cliente
                Thread.sleep(1000);
                System.out.println("Cliente de la fila " + tipoFila + " ha sido atendido por " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

