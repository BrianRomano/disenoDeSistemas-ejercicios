package prueba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concursantes.Concursante;

public class PruebaConcursoTalento {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Concursante malabarista1 = (Concursante) ctx.getBean("solei");
        malabarista1.ejecutar();

        Concursante malabarista2 = (Concursante) ctx.getBean("soleiRecitador");
        malabarista2.ejecutar();

    }
}
