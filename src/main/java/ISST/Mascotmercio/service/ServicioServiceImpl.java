package ISST.Mascotmercio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ISST.Mascotmercio.entity.Servicio;
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

}
