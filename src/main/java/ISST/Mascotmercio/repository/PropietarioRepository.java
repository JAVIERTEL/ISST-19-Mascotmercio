package ISST.Mascotmercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ISST.Mascotmercio.entity.Propietario;

@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Long>{
    
}
