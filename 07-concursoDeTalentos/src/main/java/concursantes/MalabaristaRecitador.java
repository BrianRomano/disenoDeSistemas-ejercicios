package concursantes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("soleiRecitador")
public class MalabaristaRecitador extends Malabarista {

    private Poema poema;

//    public MalabaristaRecitador() {
//    	super();
//    }
    
//    public MalabaristaRecitador(Poema poema) {
//        super();
//        this.poema = poema;
//    }

    public MalabaristaRecitador(@Value("15") int pelotas, Poema poema) {
        super(pelotas);
        this.poema = poema;
    }

    @Override
    public void ejecutar() throws EjecucionException {
        super.ejecutar();
        System.out.println("Mientras recita...");
        poema.recitar();
        System.out.println("Termina recitacion...");
    }
}
