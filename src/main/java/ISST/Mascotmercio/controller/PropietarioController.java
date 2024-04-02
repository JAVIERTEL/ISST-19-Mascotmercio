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

    @PostMapping("/create")
    public Propietario crearPropietario(@RequestBody Propietario propietario){
        return propietarioService.crearPropietario(propietario);
    }

    @DeleteMapping("/delete")
    public void borrarPropietario(@RequestBody Propietario propietario){
        propietarioService.borrarPropietario(propietario);
    }

    @PutMapping("/edit")
    public Propietario editarPropietario(@RequestBody Propietario propietario){
        return propietarioService.editarPropietario(propietario);
    
}
}