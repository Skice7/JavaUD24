package mainApp.dto;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "empleado")
public class Empleado {

//Definimos atributos de clase
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "trabajo")//no hace falta si se llama igual
	private String trabajo;
	@Column(name = "salario")//no hace falta si se llama igual
	private double salario;


	public Empleado() {
		
	}
	/**
	 * @param id
	 * @param nombre
	 * @param trabajo
	 * @param salario 
	 */
	public Empleado(Long id, String nombre, String trabajo, double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = salario;
		
	}
	public Long getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTrabajo() {
		return trabajo;
	}
	public double getSalario() {
		return salario;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}

	

	
}