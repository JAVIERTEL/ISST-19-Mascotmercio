package ISST.Mascotmercio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "servicio")
@Data
public class Servicio {
    @Id
    private Long idServicio;
    private boolean admite_mascota;
    private boolean comida;
    private boolean ocio;
    private boolean peluqueria;
    private boolean accesorios;

    @ManyToOne
    @JoinColumn(
        name = "id",
        referencedColumnName = "idTienda"
    )
    private Tienda tienda;
    
}
