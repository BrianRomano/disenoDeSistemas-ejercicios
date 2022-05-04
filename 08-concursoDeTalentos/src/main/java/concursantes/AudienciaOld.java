package concursantes;

import org.springframework.stereotype.Component;

@Component
public class AudienciaOld {

    public void sentarse() {
        System.out.println("Old: El show esta por comenzar, favor de tomar asiento...");
    }

    public void apagarCelulares() {
        System.out.println("Old: Favor de apagar celulares...");
    }

    public void aplaudir() {
        System.out.println("Old: El show ha terminado, clap clap clap");
    }

    public void devolucion() {
        System.out.println("Old: El show fue terrible, se devolverán las entradas");
    }
}
