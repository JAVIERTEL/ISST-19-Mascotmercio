package ISST.Mascotmercio.service;

import java.util.List;

import ISST.Mascotmercio.entity.Cliente;

public interface ClienteService {
    List<Cliente> findAll();
    Cliente crearCliente(Cliente cliente);
    void borrarCliente(Cliente cliente);
    Cliente editarCliente(Cliente cliente);
}
