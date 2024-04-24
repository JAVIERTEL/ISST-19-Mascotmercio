package ISST.Mascotmercio.service;

import java.util.List;

import ISST.Mascotmercio.entity.Cliente;
import ISST.Mascotmercio.Dto.ClienteDTO;
import ISST.Mascotmercio.Dto.LoginDTO;
import ISST.Mascotmercio.response.LoginMessage;

public interface ClienteService {
    List<Cliente> findAll();
    Cliente crearCliente(Cliente cliente);
    void borrarCliente(String usuario);
    Cliente editarCliente(Cliente cliente);
    String crearClienteDTO(ClienteDTO clienteDTO);
    LoginMessage loginCliente(LoginDTO loginDTO);
    String getEmailByUsuario(String usuario); 

}
