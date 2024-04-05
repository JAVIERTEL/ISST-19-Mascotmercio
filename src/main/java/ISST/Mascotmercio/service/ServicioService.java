package ISST.Mascotmercio.service;

import java.util.List;

import ISST.Mascotmercio.entity.Servicio;

public interface ServicioService {
    List<Servicio> findAll();

    Servicio createServicio(Servicio servicio); 

    Servicio updateServicio(Servicio servicio); 

    void deleteServicio(Long id); 
}
