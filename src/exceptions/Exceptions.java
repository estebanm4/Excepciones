package exceptions;

public class Exceptions {

    public static void main(String[] args) {
       
        EjemploExcepcion e = new EjemploExcepcion();
        try{
            e.mA();
        }catch (JuanException g) {
            System.out.println("Error");
        }
    }
    
}
