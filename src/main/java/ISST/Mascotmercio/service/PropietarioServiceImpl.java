package ISST.Mascotmercio.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ISST.Mascotmercio.entity.Cliente;
import ISST.Mascotmercio.entity.Propietario;
import ISST.Mascotmercio.repository.PropietarioRepository;

@Service
public class PropietarioServiceImpl  implements PropietarioService{
    
    @Autowired
    PropietarioRepository repository;

    @Override
    public List<Propietario> findAll(){
        return repository.findAll();
    }

    public Propietario crearPropietario(Propietario propietario){
    return repository.save(propietario);
    }

    public void borrarPropietario(String usuario){
        repository.deleteById(usuario);
    }

    public Propietario editarPropietario(Propietario propietario){
        return repository.save(propietario);
    }
}
