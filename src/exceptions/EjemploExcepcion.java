package exceptions;

public class EjemploExcepcion {
    
    public int mA() throws JuanException{
        return this.mB();
    }
    public int mB() throws JuanException{
        return this.mC(0);
    }
    public int mC(int denominador)throws JuanException {    
        if (denominador == 0){
            throw new JuanException("Division por cero");
        } else {
            return 10/denominador;
        }
    }
    
}
