public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Thread filaPreferencial = new Thread(new Fila(banco, "Preferencial"));
        Thread filaPrioritaria = new Thread(new Fila(banco, "Prioritaria"));

        filaPreferencial.start();
        filaPrioritaria.start();
    }
}
