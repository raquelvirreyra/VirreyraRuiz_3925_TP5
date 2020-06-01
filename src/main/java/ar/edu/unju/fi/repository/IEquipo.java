/**
 * 
 */
package ar.edu.unju.fi.repository;

/**
 * @author Ayelén Raquel Virreyra Ruiz
 *
 */
import ar.edu.unju.fi.model.Equipo;

public interface IEquipo {
	public void guardar();
	public Equipo mostrar();
	public void eliminar();
	public Equipo modificar();
}