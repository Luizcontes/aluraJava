public class Fluxo {

    public static void main(String[] args) {

        try (Conexao con = new Conexao()) {
            con.leDados();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }    
    
    // public static void main(String[] args) {
    //     Conexao con = null;
    //     try {
    //         con = new Conexao();
    //         con.leDados();
    //         con.fecha();
    //     } catch (IllegalStateException e) {
    //         System.out.println(e.getMessage());
    //     } finally {
    //         con.fecha();
    //     }
    // }

    // public static void main(String[] args) {
    // Filho filho = new Filho();
    // try {
    // filho.executa();
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }

    // public static void main(String[] args) {
    // System.out.println("Ini do main");
    // metodo1();
    // System.out.println("Fim do main");
    // }

    // public static void metodo1() {
    // System.out.println("Ini do metodo1");
    // try {
    // metodo2();
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // System.out.println("Fim do metodo1");

    // }

    // public static void metodo2() throws CustomException {
    // System.out.println("Ini do metodo2");
    // throw new CustomException("Fuck you bitch!!!");
    // }
}