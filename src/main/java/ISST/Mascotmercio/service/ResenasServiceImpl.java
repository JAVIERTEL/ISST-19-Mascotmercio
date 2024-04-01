package ISST.Mascotmercio.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ISST.Mascotmercio.entity.Resenas;
import ISST.Mascotmercio.repository.ResenasRepository;

@Service
public class ResenasServiceImpl implements ResenasService{
        
    @Autowired
    ResenasRepository repository;

    @Override
    public List<Resenas> findAll(){
        return repository.findAll();
    }

    public Resenas crearResena(Resenas resenas){
        return repository.save(resenas);
    }

    public void borrarResena(Resenas resenas){
        repository.delete(resenas);
    }

    public Resenas editarResena(Resenas resenas){
        return repository.save(resenas);
    }

}
