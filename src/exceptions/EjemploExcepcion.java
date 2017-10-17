package exceptions;

public class EjemploExcepcion {
    
    public int mA() throws IllegalArgumentException{
        return this.mB();
    }
    public int mB() throws IllegalArgumentException{
        return this.mC(0);
    }
    public int mC(int denominador)throws ArithmeticException {    
        if (denominador == 0){
            throw new IllegalArgumentException();
        } else {
            return 10/denominador;
        }
    }
    
}
