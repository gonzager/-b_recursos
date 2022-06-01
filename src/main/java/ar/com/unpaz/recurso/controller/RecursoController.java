package ar.com.unpaz.recurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.unpaz.recurso.model.Recurso;
import ar.com.unpaz.recurso.service.RecursoService;

@RestController
@RequestMapping("/v1/recurso")
public class RecursoController {

	@Autowired
	private RecursoService  recursoService;
	
	 @GetMapping
	 private List<Recurso> getAll(){
		return  recursoService.getAll();
	 }
	 
	 @GetMapping("/{id}")
	 private Recurso getBy(@PathVariable Long id){
		return  recursoService.getById(id);
	 }
	 @PostMapping
	 private Recurso save(@RequestBody Recurso recurso) {
		 return  recursoService.save(recurso);
	 }
	 
	
}
