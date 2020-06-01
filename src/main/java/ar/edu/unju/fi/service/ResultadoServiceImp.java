/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.repository.IResultado;

/**
 * @author Ayelén Raquel Virreyra Ruiz
 *
 */

@Repository
public class ResultadoServiceImp implements IResultadoService {

	@Autowired
	private IResultado iresultado;
	
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		iresultado.guardar();
	}

	@Override
	public Resultado mostrar() {
		// TODO Auto-generated method stub
		Resultado resultado = iresultado.mostrar();
		return resultado;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		iresultado.eliminar();
	}

	@Override
	public Resultado modificar() {
		// TODO Auto-generated method stub
		Resultado resultado = iresultado.modificar();
		return resultado;
	}

}
