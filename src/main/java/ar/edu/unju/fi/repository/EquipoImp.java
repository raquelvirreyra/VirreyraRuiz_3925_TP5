/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.VirreyraRuiz3925Tp5Application;
import ar.edu.unju.fi.model.Equipo;

/**
 * @author Ayelén Raquel Virreyra Ruiz
 *
 */

@Repository("equipoImp")
public class EquipoImp implements IEquipo {

	@Autowired
	private Equipo equipo;
	
	public static Logger LOG = LoggerFactory.getLogger(VirreyraRuiz3925Tp5Application.class);
	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto equipo en la BD.
		LOG.info("El equipo fue guardado.");
	}

	@Override
	public Equipo mostrar() {
		// Se recuperan todos los datos del equipo.
		LOG.info("Mostrar el equipo.");
		return equipo;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto equipo de la BD.
		LOG.info("Se elimino el equipo de la BD.");
	}

	@Override
	public Equipo modificar() {
		// Se modifica el resultado de la BD.
		LOG.info("Se modifico el equipo en la BD.");
		return equipo;
	}

}
