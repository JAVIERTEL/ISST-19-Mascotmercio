package ISST.Mascotmercio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ISST.Mascotmercio.entity.Cliente;
import ISST.Mascotmercio.service.ClienteService;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/findAll")
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }

    @PostMapping("/create")
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return clienteService.crearCliente(cliente);
    }

    @DeleteMapping("/delete")
    public void borrarCliente(@RequestBody Cliente cliente){
        clienteService.borrarCliente(cliente);
    }

    @PutMapping("/edit")
    public Cliente editarCliente(@RequestBody Cliente cliente){
        return clienteService.editarCliente(cliente);
    }
    

    
}
