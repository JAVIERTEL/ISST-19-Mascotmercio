package ISST.Mascotmercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ISST.Mascotmercio.entity.Servicio;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Long>{

}
