/**
 * 
 */
package ar.edu.fi.unju.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.IUsuarioService;

/**
 * @author Ayelén Raquel Virreyra Ruiz
 *
 */

public class MainController {
	@Autowired
	private IUsuarioService usuarioService;
	
	@RequestMapping("http://localhost:8080/home")
	public String main(Model model) {
		model.addAttribute("usuario", usuarioService.mostrar().getNombre());
		return "index";
	}
}
