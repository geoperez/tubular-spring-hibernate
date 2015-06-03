package hello.model;
import javax.persistence.*;

@Table( name = "productos" )
@Entity
public class Producto {

	@Id
    @Column(name="id")
    protected Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getFamilia_id() {
		return familia_id;
	}

	public void setFamilia_id(Integer familia_id) {
		this.familia_id = familia_id;
	}

	@Column(name="nombre")
	protected String nombre;
	
    @Column(name="familia_id")
    protected Integer familia_id;
    
}
