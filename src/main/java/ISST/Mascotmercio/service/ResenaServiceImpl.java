package ISST.Mascotmercio.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ISST.Mascotmercio.entity.Resena;
import ISST.Mascotmercio.repository.ResenaRepository;

@Service
public class ResenaServiceImpl implements ResenaService{
        
    @Autowired
    ResenaRepository repository;

    @Override
    public List<Resena> findAll(){
        return repository.findAll();
    }

    public Resena crearResena(Resena resena){
        return repository.save(resena);
    }

    public void borrarResena(Long id){
        repository.deleteById(id);
    }

    public Resena editarResena(Resena resena){
        return repository.save(resena);
    }

}
