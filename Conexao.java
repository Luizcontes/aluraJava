public class Conexao implements AutoCloseable{
    
    public Conexao() {
        System.out.println("Abrindo conexao");
        throw new IllegalStateException("Deu erro na conexao");

    }

    public void leDados() {
        System.out.println("Recebendo dados");
        // throw new IllegalStateException("Deu erro na conexao");
    }

    public void fecha() {
        System.out.println("Fechando conexao");
    }

    public void close() {
        fecha();
    }
}
