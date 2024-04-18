package ISST.Mascotmercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.util.Optional;

import ISST.Mascotmercio.entity.Propietario;
@EnableJpaRepositories
@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, String>{

     Optional<Propietario> findOneByEmailAndContraseña(String email, String contraseña);

    Propietario findByUsuario (String usuario);
    
    
}
