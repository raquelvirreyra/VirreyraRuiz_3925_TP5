package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;

import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.service.IResultadoService;

import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.service.INoticiaService;

import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.service.IEstadioService;

import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.service.IEquipoService;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.service.ICuotaService;

@SpringBootApplication
public class VirreyraRuiz3925Tp5Application implements CommandLineRunner{

	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	
	@Autowired
	IResultadoService resultadoService;
	@Autowired
	Resultado resultado;
	
	@Autowired
	INoticiaService noticiaService;
	@Autowired
	Noticia noticia;
	
	@Autowired
	IEstadioService estadioService;
	@Autowired
	Estadio estadio;
	
	@Autowired
	IEquipoService equipoService;
	@Autowired
	Equipo equipo;
	
	@Autowired
	ICuotaService cuotaService;
	@Autowired
	Cuota cuota;
	
	public static void main(String[] args) {
		SpringApplication.run(VirreyraRuiz3925Tp5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		//Inicializo las variables de mi objeto usuario.
		usuario.setApellido("Perez");
		usuario.setDireccion("Av Mitre 256");
		usuario.setDni(30215478);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1980, 11, 12));
		usuario.setId(1);
		usuario.setNombre("Juan");
		usuario.setPassword("123");
		usuario.setTipo("SOCIO");
		//Guardo en la BD los datos de usuario.
		usuarioService.guardar();
		
		//Inicializo las variables de mi objeto noticia.
		noticia.setFecha(LocalDate.of(2020, 4, 11));
		noticia.setTitulo("Vuelta al futbol");
		noticia.setResumen("El presidente de La Liga, Javier Tebas, espera que el fútbol español se reanude el "
				+ "12 de junio después de estar tres meses paralizado debido a la pandemia de coronavirus.");
		//Guardo en la BD los datos de noticia.
		noticiaService.guardar();
		
		//Inicializo las variables de mi objeto estadio.
		estadio.setNombre("Presidente Peron");
		estadio.setFechaFundacion(LocalDate.of(1903, 2, 25));
		estadio.setCiudad("Avellaneda");
		estadio.setCapacidad(53000);
		estadio.setDireccion("Orestes Omar Corbatta y Mozart");
		//Guardo en la BD los datos de estadio.
		estadioService.guardar();
		
		//Inicializo las variables de mi objeto equipo.
		equipo.setNombre("Racing");
		equipo.setEstadio(estadio);
		//Guardo en la BD los datos de equipo.
		equipoService.guardar();
		
		//Inicializo las variables de mi objeto resultado.
		resultado.setFecha(LocalDate.of(2020, 2, 3));
		resultado.setEquipo1(equipo);
		
		Estadio estadio2 = new Estadio("Libertadores de America", LocalDate.of(1905, 0, 1), "Avellaneda", 52364, "Avenida Mitre 470");
		Equipo equipo2 = new Equipo("Independiente", estadio2);
		resultado.setEquipo2(equipo2);
		resultado.setGolesEquipo1(1);
		resultado.setGolesEquipo2(1);
		//Guardo en la BD los datos del resultado.
		resultadoService.guardar();
		
		//Inicializo las variables de mi objeto cuota.
		cuota.setId(1);
		cuota.setFechaPago(LocalDate.now());
		cuota.setPeriodo("Mayo");
		cuota.setMonto(1500);
		cuota.setEstado("Debiendo");
		cuota.setUsuario(usuario);
		//Guardo en la BD los datos de la cuota.
		cuotaService.guardar();
	}
}
