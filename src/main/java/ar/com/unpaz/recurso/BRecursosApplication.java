package ar.com.unpaz.recurso;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.com.unpaz.recurso.model.Agenda;
import ar.com.unpaz.recurso.model.DetalleAgenda;
import ar.com.unpaz.recurso.model.Recurso;
import ar.com.unpaz.recurso.model.Usuario;
import ar.com.unpaz.recurso.service.AgendaService;
import ar.com.unpaz.recurso.service.RecursoService;
import ar.com.unpaz.recurso.service.UsuarioService;

@SpringBootApplication
public class BRecursosApplication implements CommandLineRunner  {

	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private RecursoService recursoService;
	
	@Autowired
	private AgendaService agenService;
	
	public static void main(String[] args) {
		SpringApplication.run(BRecursosApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		 Usuario usuario = new Usuario();
		 usuario.setNombre("Javier");
		 usuario.setApellido("Molina");
		 usuario.setFechaNacimiento("25/02/1988");
		 
		 Recurso recurso = new Recurso();
		 recurso.setNombre("MOUSE");
		 
		 usuarioService.save(usuario);
		 recursoService.save(recurso);
		 
		 Agenda agenda = new Agenda();
		 agenda.setEstado("OK");
		 
		 
		 agenda.setUsuario(usuarioService.getById(1L));
		 List<DetalleAgenda> detalle = new ArrayList<DetalleAgenda>();
		 DetalleAgenda dt = new DetalleAgenda();
		 dt.setAgenda(agenda);
		 dt.setEstado("OK");
		 dt.setRecurso(recursoService.getById(1L));
		 
		 detalle.add(dt);
		 agenda.setListDetalle(detalle);
		 agenService.save(agenda);
		 
		
	}
}
