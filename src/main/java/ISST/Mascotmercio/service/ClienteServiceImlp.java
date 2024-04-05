package ISST.Mascotmercio.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ISST.Mascotmercio.entity.Cliente;
import ISST.Mascotmercio.repository.ClienteRepository;


@Service
public class ClienteServiceImlp implements ClienteService {

    @Autowired
    ClienteRepository repository;

    @Override
    public List<Cliente> findAll(){
        return repository.findAll();
    }

    public Cliente crearCliente(Cliente cliente){
        return repository.save(cliente);
    }

    
    public void borrarCliente(String usuario) {
        repository.deleteById(usuario);
    }

    public Cliente editarCliente(Cliente cliente){
        return repository.save(cliente);
    }
    
}
