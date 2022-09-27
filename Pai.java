public class Pai {
    
    public void executa() throws CustomException{
        System.out.println("Metodos perigoso na classe pai!");
        throw new CustomException("Esta e uma CustomException");
    }
}
