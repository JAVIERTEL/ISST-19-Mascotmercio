package ISST.Mascotmercio.service;

import java.util.List;

import ISST.Mascotmercio.entity.Propietario;

public interface PropietarioService {
    List<Propietario> findAll();
    Propietario crearPropietario(Propietario propietario);
    void borrarPropietario(String usuario);
    Propietario editarPropietario(Propietario propietario);
}
