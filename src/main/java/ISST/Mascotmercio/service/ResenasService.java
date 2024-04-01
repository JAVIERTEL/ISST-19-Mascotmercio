package ISST.Mascotmercio.service;

import java.util.List;

import ISST.Mascotmercio.entity.Resenas;

public interface ResenasService {
    List<Resenas> findAll();
    Resenas crearResena(Resenas resenas);
    void borrarResena(Resenas resenas);
    Resenas editarResena(Resenas resenas);
}
