package ISST.Mascotmercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.stereotype.Repository;
import java.util.Optional;
import ISST.Mascotmercio.entity.Cliente;
@EnableJpaRepositories
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String>{

    Optional<Cliente> findOneByEmailAndContraseña(String email, String contraseña);

    Cliente findByUsuario (String usuario);
}
