package concursantes;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AudienciaAround {

    public void monitorearShow(ProceedingJoinPoint joinpoint) {
        try {
            System.out.println("Around: El show esta por comenzar, favor de tomar asiento...");
            System.out.println("Around: Favor de apagar celulares...");

            //Anotamos la hora de inicio
            long horaInicio = System.currentTimeMillis();

            //Se llama al metodo de negocio (metodo objetivo)
            joinpoint.proceed();

            Thread.sleep(1000); //1 segundo
            //Este delay en milisegundos es opcional y se puede poner en los metodos
            //de negocio para simular la duracion del metodo

            long horaTermino = System.currentTimeMillis();

            System.out.println("Around: El show ha termiado, aplausos");
            System.out.println("Around: El show tuvo una duracion:" + (horaTermino - horaInicio));
        } catch (Throwable t) {
            System.out.println("Around: El show fue terrible, se devolveran las entradas");
        }
    }
}