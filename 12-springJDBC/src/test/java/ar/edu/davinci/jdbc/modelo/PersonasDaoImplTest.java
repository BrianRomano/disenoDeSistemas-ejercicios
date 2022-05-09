package ar.edu.davinci.jdbc.modelo;

import static org.junit.Assert.assertEquals;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.davinci.jdbc.modelo.Persona;
import ar.edu.davinci.jdbc.modelo.PersonaDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:datasource-test.xml",
    "classpath:applicationContext.xml"})
public class PersonasDaoImplTest {

    private final Logger logger = LogManager.getRootLogger();
    
    @Autowired(required = true)    
    private PersonaDao personaDao;

    @Test
    public void deberiaMostrarPersonas() {
        try {
            System.out.println();
            logger.info("Inicio del test deberiaMostrarPersonas");

            List<Persona> personas = personaDao.findAllPersonas();

            int contadorPersonas = 0;
            for (Persona persona : personas) {
                logger.info("Persona: " + persona);
                contadorPersonas++;
            }

            //Segun el numero de personas recuperadas, deberia ser el mismo de la tabla
            assertEquals(contadorPersonas, personaDao.contadorPersonas());

            logger.info("Fin del test deberiaMostrarPersonas");
        } catch (Exception e) {
            logger.error("Error JBDC", e);
        }
    }

}
