package ISST.Mascotmercio.entity;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
@Table(name = "resena")
public class Resena{
    @Id
    private Long idResena;
    private String autor;
    private String titulo; // Asumo que se agrega un atributo 'titulo' para representar el título de la reseña
    private String contenido;
    
    // Relación ManyToOne con la entidad Tienda
    @ManyToOne
    @JoinColumn(
        name ="id_tienda",
        referencedColumnName = "idTienda") // Columna en la tabla Resenas que hace referencia al ID de la tienda
    private Tienda tienda;

    // Relación ManyToOne con la entidad Cliente
    @ManyToOne
    @JoinColumn(
        name ="id_cliente",
        referencedColumnName = "usuario") // Columna en la tabla Resenas que hace referencia al ID del cliente
    private Cliente cliente;

    
}

