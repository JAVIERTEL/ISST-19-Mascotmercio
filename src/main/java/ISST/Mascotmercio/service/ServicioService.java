package ISST.Mascotmercio.service;

import java.util.List;

import ISST.Mascotmercio.entity.Servicio;
import ISST.Mascotmercio.entity.Tienda;

public interface ServicioService {
    List<Servicio> findAll();

    Servicio createServicio(Servicio servicio); 

    Servicio updateServicio(Servicio servicio); 

    Servicio findById(Long id);

    void deleteServicio(Long id); 
}
