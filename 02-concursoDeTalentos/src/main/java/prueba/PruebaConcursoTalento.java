package prueba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concursantes.Concursante;
import concursantes.EjecucionException;
import concursantes.Malabarista;

public class PruebaConcursoTalento {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Concursante malabarista1 = (Concursante) ctx.getBean("solei");
        try {
            malabarista1.ejecutar();
        } catch (EjecucionException e) {
        	System.out.println("SE FUE");
        } finally {
        	System.out.println("SE FUE SIEMPRE");        	
        }

    }
}
