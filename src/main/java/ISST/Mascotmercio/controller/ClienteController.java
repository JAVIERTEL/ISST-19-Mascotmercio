package ISST.Mascotmercio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.http.ResponseEntity;
import ISST.Mascotmercio.Dto.ClienteDTO;
import ISST.Mascotmercio.Dto.LoginDTO;
import ISST.Mascotmercio.response.LoginMessage;
import ISST.Mascotmercio.entity.Cliente;
import ISST.Mascotmercio.service.ClienteService;

@RestController
@RequestMapping("api/cliente")
@CrossOrigin(origins = "http://localhost:3000")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/findAll")
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }

    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return clienteService.crearCliente(cliente);
    }

    @DeleteMapping("/{usuario}")
    public void borrarCliente(@RequestBody String usuario){
        clienteService.borrarCliente(usuario);
    }

    @PutMapping("/edit")
    public Cliente editarCliente(@RequestBody Cliente cliente){
        return clienteService.editarCliente(cliente);
    }
    @PostMapping(path="/save")
    public String saveCliente (@RequestBody ClienteDTO clienteDTO){
        String id= clienteService.crearClienteDTO(clienteDTO);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginCliente(@RequestBody LoginDTO loginDTO)
    {
        LoginMessage loginMessage  = clienteService.loginCliente(loginDTO);
        return ResponseEntity.ok(loginMessage);
    }

    @GetMapping("/email")
    public ResponseEntity<String> getEmailByUsuario(@RequestParam String usuario) {
    String email = clienteService.getEmailByUsuario(usuario);
    return new ResponseEntity<>(email, HttpStatus.OK);
}

    
}
