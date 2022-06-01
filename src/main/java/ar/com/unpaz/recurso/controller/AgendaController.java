package ar.com.unpaz.recurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.unpaz.recurso.model.Agenda;

import ar.com.unpaz.recurso.service.AgendaService;

@RestController
@RequestMapping("/v1/agenda")
public class AgendaController {

	 @Autowired
	 private AgendaService agendaService;
	 @GetMapping
	 private List<Agenda> getAll(){
		return  agendaService.getAll();
	 }
	
	 @GetMapping("/{id}")
	 private Agenda getBy(@PathVariable Long id){
		return  agendaService.getById(id);
	 }
	 @PostMapping
	 private Agenda save(@RequestBody Agenda recurso) {
		 return  agendaService.save(recurso);
	 }
	
}
