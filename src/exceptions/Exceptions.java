package exceptions;

public class Exceptions {

    public static void main(String[] args) {
       
        EjemploExcepcion e = new EjemploExcepcion();
        try{
            e.mA();
        }catch (IllegalArgumentException e) {
            System.out.println("Error");
        }
    }
    
}
