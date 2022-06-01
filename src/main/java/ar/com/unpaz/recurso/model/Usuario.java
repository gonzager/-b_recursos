package ar.com.unpaz.recurso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@Entity
@Data
@Table(name="USUARIOS")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USUARIO_ID")
	private Long usuarioId;
	private String nombre;
	
	@Column(name = "Apellido")
	@NonNull
	private String apellido;
	
	@Column(name = "DNI")
	@NonNull
	private String nroDocumento;
	
	@Column(name = "FECHA_NACIMIENTO")
	@NonNull
	private String fechaNacimiento;
	
}
