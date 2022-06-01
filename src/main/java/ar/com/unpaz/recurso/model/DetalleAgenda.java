package ar.com.unpaz.recurso.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


import lombok.Data;

@Entity
@Data
@Table(name="DETALLE_AGENDA")
public class DetalleAgenda {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="DETALLE_AGENDA_ID")
	private Long detalleAgendaId;
	
	private String estado ;
	
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="AGENDA_ID")
	private Agenda agenda;
	
	

	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name="RECURSO_ID")
	Recurso recurso;
	
	
}
