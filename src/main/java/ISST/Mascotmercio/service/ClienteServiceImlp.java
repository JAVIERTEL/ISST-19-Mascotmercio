package ISST.Mascotmercio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import ISST.Mascotmercio.entity.Cliente;
import ISST.Mascotmercio.repository.ClienteRepository;
import ISST.Mascotmercio.Dto.ClienteDTO;
import ISST.Mascotmercio.Dto.LoginDTO;
import ISST.Mascotmercio.response.LoginMessage;

@Service
public class ClienteServiceImlp implements ClienteService {

    @Autowired
    ClienteRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String crearClienteDTO(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente (
            clienteDTO.getUsuario(),
            clienteDTO.getEmail(),
            this.passwordEncoder.encode(clienteDTO.getContraseña())
        );
        repository.save(cliente);
        return cliente.getUsuario();
    }

    public LoginMessage loginCliente(LoginDTO loginDTO) {
        String usuario = loginDTO.getUsuario();
        String contraseña = loginDTO.getContraseña();
        Cliente cliente = repository.findByUsuario(usuario);
        
        if (cliente == null) {
            return new LoginMessage("Cliente no existe", false);
        }

        String storedPassword = cliente.getContraseña();

        // Verifica si la contraseña almacenada está encriptada con BCrypt
        boolean isStoredPasswordBCrypt = passwordEncoder.matches(contraseña, storedPassword);
        
        // Si la contraseña almacenada no está encriptada, compara en texto plano, 
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

    @Override
public String getEmailByUsuario(String usuario) {
    Cliente cliente = repository.findByUsuario(usuario);
    if (cliente == null) {
        throw new IllegalArgumentException("Cliente no encontrado");
    }
    return cliente.getEmail();
    }
}
