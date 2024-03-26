package ISST.Mascotmercio.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tienda")
@Data
public class Tienda {
    @Id
    private Long idTienda;
    private String nombre;
    private String direccion;

    // Relación ManyToOne con la entidad Propietario
    @ManyToOne
    @JoinColumn(
        name ="id_propietario",
        referencedColumnName = "usuario") // Columna en la tabla Resenas que hace referencia al ID del propietario
    private Propietario propietario;


    @ManyToMany
    @JoinTable(
        name = "tienda_cliente",
        joinColumns = @JoinColumn(name = "tienda_id"),
        inverseJoinColumns = @JoinColumn(name = "cliente_id")
    )
    private Set<Cliente> clientes;
}
