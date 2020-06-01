/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.VirreyraRuiz3925Tp5Application;
import ar.edu.unju.fi.model.Resultado;

/**
 * @author Ayelén Raquel Virreyra Ruiz
 *
 */

@Repository("resultadoImp")
public class ResultadoImp implements IResultado {

	@Autowired
	private Resultado resultado;
	
	public static Logger LOG = LoggerFactory.getLogger(VirreyraRuiz3925Tp5Application.class);
	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto resultado en la BD.
		LOG.info("El resultado fue guardado.");
	}

	@Override
	public Resultado mostrar() {
		// Se recuperan todos los datos del resultado.
		LOG.info("Mostrar el resultado.");
		return resultado;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto resultado de la BD.
		LOG.info("Se elimino el usuario de la BD.");
	}

	@Override
	public Resultado modificar() {
		// Se modifica el resultado de la BD.
		LOG.info("Se modifico el resultado en la BD.");
		return resultado;
	}

}
