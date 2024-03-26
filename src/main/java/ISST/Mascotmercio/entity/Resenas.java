package ISST.Mascotmercio.entity;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
@Table(name = "resenas")
public class Resenas {
    @Id
    private String autor;
    private String titulo; // Asumo que se agrega un atributo 'titulo' para representar el título de la reseña
    private String contenido;
    
    // Relación ManyToOne con la entidad Tienda
//     @ManyToOne
//     @JoinColumn(
//         name ="Id",
//         referencedColumnName = "idTienda") // Columna en la tabla Resenas que hace referencia al ID de la tienda
//     private Tienda tienda;
    
//     // Relación ManyToOne con la entidad Cliente
//     @ManyToOne
//     @JoinColumn(name ="clienteId") // Columna en la tabla Resenas que hace referencia al ID del cliente que escribe la reseña
//     private Cliente cliente;
 }

