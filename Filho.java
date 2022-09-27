public class Filho extends Pai {
    
    public void executa() throws CustomException{
        super.executa();
        System.out.println("Metodo perigoso na classe filho!");
    }
}
