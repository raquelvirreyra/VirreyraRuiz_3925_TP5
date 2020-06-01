/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.VirreyraRuiz3925Tp5Application;
import ar.edu.unju.fi.model.Cuota;

/**
 * @author Ayelén Raquel Virreyra Ruiz
 *
 */

@Repository("resultadoImp")
public class CuotaImp implements ICuota {

	@Autowired
	private Cuota cuota;
	
	public static Logger LOG = LoggerFactory.getLogger(VirreyraRuiz3925Tp5Application.class);
	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto cuota en la BD.
		LOG.info("La cuota fue guardado.");
	}

	@Override
	public Cuota mostrar() {
		// Se recuperan todos los datos del resultado.
		LOG.info("Mostrar cuota.");
		return cuota;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto cuota de la BD.
		LOG.info("Se elimino la cuota de la BD.");
	}

	@Override
	public Cuota modificar() {
		// Se modifica el resultado de la BD.
		LOG.info("Se modifico la cuota en la BD.");
		return cuota;
	}

}

