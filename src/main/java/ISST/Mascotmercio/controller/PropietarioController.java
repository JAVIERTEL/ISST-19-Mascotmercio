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
import ISST.Mascotmercio.Dto.PropietarioDTO;
import ISST.Mascotmercio.Dto.LoginDTO;
import ISST.Mascotmercio.response.LoginMessage;
import ISST.Mascotmercio.entity.Propietario;
import ISST.Mascotmercio.service.PropietarioService;

@RestController
@RequestMapping("api/propietario")
@CrossOrigin(origins = "http://localhost:3000")
public class PropietarioController {

    @Autowired
    PropietarioService propietarioService;

    @GetMapping("/findAll")
    public List<Propietario> findAll(){
        return propietarioService.findAll();
    }

    @PostMapping
    public Propietario crearPropietario(@RequestBody Propietario propietario){
        return propietarioService.crearPropietario(propietario);
    }

    @DeleteMapping("/{usuario}")
    public void borrarPropietario(@RequestBody String usuario){
        propietarioService.borrarPropietario(usuario);
    }

    @PutMapping("/edit")
    public Propietario editarPropietario(@RequestBody Propietario propietario){
        return propietarioService.editarPropietario(propietario);
    }

    @PostMapping(path="/save")
    public String savePropietario (@RequestBody PropietarioDTO propietarioDTO){
        String id= propietarioService.crearPropietarioDTO(propietarioDTO);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginPropietario(@RequestBody LoginDTO loginDTO)
    {
        LoginMessage loginMessage  = propietarioService.loginPropietario(loginDTO);
        return ResponseEntity.ok(loginMessage);
    }
    @GetMapping("/email")
    public ResponseEntity<String> getEmailByUsuario(@RequestParam String usuario) {
        String email = propietarioService.getEmailByUsuario(usuario);
        return new ResponseEntity<>(email, HttpStatus.OK);
    }
    
    
}


