package ISST.Mascotmercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ISST.Mascotmercio.entity.Resenas;

@Repository
public interface ResenasRepository extends JpaRepository<Resenas, Long>{
    
}
