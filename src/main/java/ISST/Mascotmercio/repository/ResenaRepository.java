package ISST.Mascotmercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ISST.Mascotmercio.entity.Resena;

@Repository
public interface ResenaRepository extends JpaRepository<Resena, Long>{
    
}
