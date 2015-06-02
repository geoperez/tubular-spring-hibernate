package hello.model;
import javax.persistence.*;

@Table( name = "productos" )
@Entity
public class Producto {

	@Id
    @Column(name="id")
    public Integer id;
	
	@Column(name="nombre")
	public String nombre;
	
    @Column(name="familia_id")
    public Integer familia_id;
    
}
