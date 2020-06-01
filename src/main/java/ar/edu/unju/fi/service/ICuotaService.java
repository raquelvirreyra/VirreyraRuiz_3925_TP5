/**
 * 
 */
package ar.edu.unju.fi.service;

/**
 * @author Ayelén Raquel Virreyra Ruiz
 *
 */

import ar.edu.unju.fi.model.Cuota;

public interface ICuotaService {
	public void guardar();
	public Cuota mostrar();
	public void eliminar();
	public Cuota modificar();
}