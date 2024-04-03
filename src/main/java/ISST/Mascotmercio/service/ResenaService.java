package ISST.Mascotmercio.service;

import java.util.List;

import ISST.Mascotmercio.entity.Resena;

public interface ResenaService {
    List<Resena> findAll();
    Resena crearResena(Resena resena);
    void borrarResena(Long id);
    Resena editarResena(Resena resena);
}
