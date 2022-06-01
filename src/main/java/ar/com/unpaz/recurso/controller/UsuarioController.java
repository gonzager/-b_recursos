package ar.com.unpaz.recurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.unpaz.recurso.model.Usuario;

import ar.com.unpaz.recurso.service.UsuarioService;

@RestController
@RequestMapping("/v1/usuario")
public class UsuarioController {

	
	@Autowired
	private UsuarioService  usuarioService;
	
	 @GetMapping
	 private List<Usuario> getAll(){
		return  usuarioService.getAll();
	 }
	 
	 @GetMapping("/{id}")
	 private Usuario getBy(@PathVariable Long id){
		return  usuarioService.getById(id);
	 }
	 @PostMapping
	 private Usuario save(@RequestBody Usuario usuario) {
		 return  usuarioService.save(usuario);
	 }
	 
	
}
