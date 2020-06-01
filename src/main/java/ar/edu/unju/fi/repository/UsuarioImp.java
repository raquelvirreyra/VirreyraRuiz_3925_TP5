/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.VirreyraRuiz3925Tp5Application;
import ar.edu.unju.fi.model.Usuario;

/**
 * @author Ayelén Raquel Virreyra Ruiz
 *
 */
@Repository("usuarioImp")
public class UsuarioImp implements IUsuario {

	@Autowired
	private Usuario usuario;
	
	public static Logger LOG = LoggerFactory.getLogger(VirreyraRuiz3925Tp5Application.class);
	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto usuario en la BD.
		LOG.info("El usuario fue guardado "+usuario.getApellido()+", "+usuario.getNombre());
	}

	@Override
	public Usuario mostrar() {
		// Se recuperan todos los datos del usuario.
		LOG.info("Mostrar los datos del usuario.");
		return usuario;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto usuario de la BD.
		LOG.info("Se elimino el usuario de la BD.");
	}

	@Override
	public Usuario modificar() {
		// Se modifica el usuario de la BD.
		return usuario;
	}

}