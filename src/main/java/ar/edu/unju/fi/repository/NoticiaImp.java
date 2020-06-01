/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.VirreyraRuiz3925Tp5Application;
import ar.edu.unju.fi.model.Noticia;

/**
 * @author Ayelén Raquel Virreyra Ruiz
 *
 */

@Repository("noticiaImp")
public class NoticiaImp implements INoticia {

	@Autowired
	private Noticia noticia;
	
	public static Logger LOG = LoggerFactory.getLogger(VirreyraRuiz3925Tp5Application.class);
	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto noticia en la BD.
		LOG.info("La noticia fue guardado.");
	}

	@Override
	public Noticia mostrar() {
		// Se recuperan todos los datos de la noticia.
		LOG.info("Mostrar noticia.");
		return noticia;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto noticia de la BD.
		LOG.info("Se elimino la noticia de la BD.");
	}

	@Override
	public Noticia modificar() {
		// Se modifica la noticia de la BD.
		LOG.info("Se modifico la noticia en la BD.");
		return noticia;
	}

}

