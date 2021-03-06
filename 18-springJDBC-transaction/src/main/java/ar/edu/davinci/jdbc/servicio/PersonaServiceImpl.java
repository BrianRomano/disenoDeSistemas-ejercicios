package ar.edu.davinci.jdbc.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.davinci.jdbc.modelo.Persona;
import ar.edu.davinci.jdbc.modelo.PersonaDao;

@Service
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true) 
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaDao personaDao;

	public List<Persona> listarPersonas() {
		return personaDao.findAllPersonas();
	}

	public Persona recuperarPersona(Persona persona) {
		return personaDao.findPersonaById(persona.getIdPersona());
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false) 
	public void agregarPersona(Persona persona) {
		personaDao.insertPersona(persona);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false) 
	public void modificarPersona(Persona persona) {
		personaDao.updatePersona(persona);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false) 
	public void eliminarPersona(Persona persona) {
		personaDao.deletePersona(persona);
	}

	@Override
	public int contadorPersonas() {
		return personaDao.contadorPersonas();
	}
}
