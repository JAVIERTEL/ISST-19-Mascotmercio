package ISST.Mascotmercio.service;

import java.util.List;

import ISST.Mascotmercio.entity.Cliente;

public interface ClienteService {
    List<Cliente> findAll();
    Cliente crearCliente(Cliente cliente);
    void borrarCliente(String usuario);
    Cliente editarCliente(Cliente cliente);
}
