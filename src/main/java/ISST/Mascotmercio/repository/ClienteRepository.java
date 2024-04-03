package ISST.Mascotmercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ISST.Mascotmercio.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String>{
    
}
