package ISST.Mascotmercio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import ISST.Mascotmercio.entity.Propietario;
import ISST.Mascotmercio.repository.PropietarioRepository;
import ISST.Mascotmercio.Dto.PropietarioDTO;
import ISST.Mascotmercio.Dto.LoginDTO;
import ISST.Mascotmercio.response.LoginMessage;

@Service
public class PropietarioServiceImpl implements PropietarioService {
    
    @Autowired
    PropietarioRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String crearPropietarioDTO(PropietarioDTO propietarioDTO) {
        Propietario propietario = new Propietario(
            propietarioDTO.getUsuario(),
            propietarioDTO.getEmail(),
            this.passwordEncoder.encode((propietarioDTO.getContraseña()))
        );
        repository.save(propietario);
        return propietario.getUsuario();
    }

    public LoginMessage loginPropietario(LoginDTO loginDTO) {
        String usuario = loginDTO.getUsuario();
        String contraseña = loginDTO.getContraseña();
        Propietario propietario = repository.findByUsuario(usuario);
        
        if (propietario == null) {
            return new LoginMessage("Propietario no existe", false);
        }

        String storedPassword = propietario.getContraseña();

        // Verifica si la contraseña almacenada está encriptada con BCrypt
        boolean isStoredPasswordBCrypt = passwordEncoder.matches(contraseña, storedPassword);
        
        // Si la contraseña almacenada no está encriptada, compara en texto plano
        if (!isStoredPasswordBCrypt) {
            if (contraseña.equals(storedPassword)) {
                return new LoginMessage("Login Success", true);
            } else {
                return new LoginMessage("Login incorrecto", false);
            }
        }
        
        // Si la contraseña almacenada está encriptada con BCrypt, usa BCrypt para comparar
        if (passwordEncoder.matches(contraseña, storedPassword)) {
            return new LoginMessage("Login Success", true);
        } else {
            return new LoginMessage("Login incorrecto", false);
        }
    }
    
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
