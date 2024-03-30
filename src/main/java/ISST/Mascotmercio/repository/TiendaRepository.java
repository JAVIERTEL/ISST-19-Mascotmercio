package ISST.Mascotmercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ISST.Mascotmercio.entity.Tienda;

@Repository
public interface TiendaRepository extends JpaRepository<Tienda, Long>{

}