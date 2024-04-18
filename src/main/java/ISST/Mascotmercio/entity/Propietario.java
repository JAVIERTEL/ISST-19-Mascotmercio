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

    // Constructor con todos los campos
    public Propietario(String usuario, String contraseña, String email) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.email = email;
    }

    // Constructor vacío requerido por JPA
    public Propietario() {
    }
}



