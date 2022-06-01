package ar.com.unpaz.recurso.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
@Table(name="AGENDAS")
public class Agenda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="AGENDA_ID")
	private Long agendaId;
	
	private String estado;
	
	@OneToOne
	@JoinColumn(name="USUARIO_ID")
	private Usuario usuario;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "agenda" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<DetalleAgenda> listDetalle;
	
	
	
	
}
