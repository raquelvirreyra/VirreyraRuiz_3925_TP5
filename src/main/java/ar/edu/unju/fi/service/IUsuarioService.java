/**
 * 
 */
package ar.edu.unju.fi.service;

/**
 * @author Ayelén Raquel Virreyra Ruiz
 *
 */

import ar.edu.unju.fi.model.Usuario;

public interface IUsuarioService {
	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();
}