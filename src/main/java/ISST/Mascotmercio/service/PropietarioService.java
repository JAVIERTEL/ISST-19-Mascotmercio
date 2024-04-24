package ISST.Mascotmercio.service;

import java.util.List;

import ISST.Mascotmercio.entity.Propietario;
import ISST.Mascotmercio.Dto.PropietarioDTO;
import ISST.Mascotmercio.Dto.ClienteDTO;
import ISST.Mascotmercio.Dto.LoginDTO;
import ISST.Mascotmercio.response.LoginMessage;


public interface PropietarioService {
    List<Propietario> findAll();
    Propietario crearPropietario(Propietario propietario);
    void borrarPropietario(String usuario);
    Propietario editarPropietario(Propietario propietario);
    String crearPropietarioDTO(PropietarioDTO propietarioDTO);
    LoginMessage loginPropietario(LoginDTO loginDTO);
    String getEmailByUsuario(String usuario); 

}
