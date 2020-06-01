/**
 * 
 */
package ar.edu.unju.fi.repository;

/**
 * @author Ayelén Raquel Virreyra Ruiz
 *
 */
import ar.edu.unju.fi.model.Resultado;

public interface IResultado {
	public void guardar();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();
}
