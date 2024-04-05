package ISST.Mascotmercio.service;

import java.util.List;

import ISST.Mascotmercio.entity.Tienda;

public interface TiendaService {
    List<Tienda> findAll();

    Tienda createTienda(Tienda tienda); 

    Tienda updateTienda(Tienda tienda); 

    void deleteTienda(Long id); 
}
