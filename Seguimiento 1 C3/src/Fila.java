public class Fila implements Runnable {
    private Banco banco;
    private String tipoFila;

    public Fila(Banco banco, String tipoFila) {
        this.banco = banco;
        this.tipoFila = tipoFila;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            banco.atenderCliente(tipoFila);
        }
    }
}

