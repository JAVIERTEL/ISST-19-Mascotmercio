package ISST.Mascotmercio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "propietario")
@Data
public class Propietario {
    @Id
    private String usuario;
    private String contraseña;
    private String email;
}