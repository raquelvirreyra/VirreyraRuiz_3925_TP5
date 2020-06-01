/**
 * 
 */
package ar.edu.unju.fi.repository;

/**
 * @author Ayelén Raquel Virreyra Ruiz
 *
 */
import ar.edu.unju.fi.model.Noticia;

public interface INoticia {
	public void guardar();
	public Noticia mostrar();
	public void eliminar();
	public Noticia modificar();
}