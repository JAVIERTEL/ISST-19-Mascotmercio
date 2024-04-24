package ISST.Mascotmercio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ISST.Mascotmercio.entity.Servicio;
import ISST.Mascotmercio.entity.Tienda;
import ISST.Mascotmercio.repository.ServicioRepository;

@Service
public class ServicioServiceImpl implements ServicioService{

    @Autowired
    ServicioRepository repository;

    //Devuelve una lista con todos los servicios
    @Override
    public List<Servicio> findAll() {
        return repository.findAll();
    }

    public Servicio createServicio(Servicio servicio) {
        return repository.save(servicio);
    }

    public Servicio updateServicio(Servicio servicio) {
        return repository.save(servicio);
    }

    public void deleteServicio(Long id) {
        repository.deleteById(id);
    }
    @Override
    public Servicio findById(Long id) {
    return repository.findById(id).orElse(null);
}
}
