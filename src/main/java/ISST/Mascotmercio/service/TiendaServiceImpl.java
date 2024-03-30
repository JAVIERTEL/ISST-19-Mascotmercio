package ISST.Mascotmercio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ISST.Mascotmercio.entity.Tienda;
import ISST.Mascotmercio.repository.TiendaRepository;

@Service
public class TiendaServiceImpl implements TiendaService{

    @Autowired
    TiendaRepository repository;


    //Devuelve una lista con todas las tiendas 
    @Override
    public List<Tienda> findAll() {
        return repository.findAll();    
    }

    public Tienda createTienda(Tienda tienda) {
        return repository.save(tienda);
    }

    public Tienda updateTienda(Tienda tienda) {
        return repository.save(tienda);
    }

    public void deleteTienda(Long id) {
        repository.deleteById(id);
    }

}
