/**
 * 
 */
package ar.edu.unju.fi.service;

/**
 * @author Ayelén Raquel Virreyra Ruiz
 *
 */

import ar.edu.unju.fi.model.Equipo;

public interface IEquipoService {
	public void guardar();
	public Equipo mostrar();
	public void eliminar();
	public Equipo modificar();
}