package ar.edu.davinci.jdbc.modelo;

import static org.junit.Assert.assertEquals;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.davinci.jdbc.modelo.Persona;
import ar.edu.davinci.jdbc.modelo.PersonaDao;
import ar.edu.davinci.jdbc.servicio.PersonaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:datasource-test.xml", "classpath:applicationContext.xml"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonasDaoImplTest2 {

    private final Logger logger = LogManager.getRootLogger();

    @Autowired
    private PersonaService personaService;

    @Test
    @Transactional
    @Commit
    public void testA_Operaciones() {
        try {
            System.out.println();
            logger.info("Inicio del test testOperaciones");

            Persona persona1 = new Persona();
            //persona1.setNombre("Andrea1111111111111111111111111111111111111111111111111111");
            persona1.setNombre("Andrea");
            persona1.setApePaterno("Lara");
            persona1.setEmail("andrea.lara@mimail.com");

            personaService.agregarPersona(persona1);
            
            logger.info("Persona a agregar:" + persona1);

            //Actualizamos la persona con id=1
            Persona persona2 = personaService.recuperarPersona(new Persona(1));
            persona2.setNombre("Administrador");
            personaService.modificarPersona(persona2);
            logger.info("Persona modificada: " + persona2);
            logger.info("Listado personas:");
            this.desplegarPersonas();
            logger.info("Fin del test testOperaciones");
            System.out.println();
        } catch (Exception e) {
            logger.error("Error Servicio", e);
        }
    }

    private int desplegarPersonas() {
        List<Persona> personas = personaService.listarPersonas();
        int contadorPersonas = 0;
        for (Persona persona : personas) {
            logger.info("Persona: " + persona);
            contadorPersonas++;
        }
        return contadorPersonas;
    }

    @Test
    public void testB_CompruebaOperaciones() {
        try {
            System.out.println();
            logger.info("Inicio del testCompruebaOperaciones");
            int contadorPersonas = this.desplegarPersonas();
            //Deberia haber 3 personas si se aplico rollback, sino 4 personas
            assertEquals(contadorPersonas, personaService.contadorPersonas());
            logger.info("No. Personas: " + contadorPersonas);
            logger.info("Fin del test testCompruebaOperaciones");
        } catch (Exception e) {
            logger.error("Error Servicio", e);
        }
    }
}