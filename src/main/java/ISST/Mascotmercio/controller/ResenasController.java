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

import ISST.Mascotmercio.entity.Resenas;
import ISST.Mascotmercio.service.ResenasService;

@RestController
@RequestMapping("api/resenas")
@CrossOrigin(origins = "http://localhost:3000")
public class ResenasController {

    @Autowired
    ResenasService resenasService;

    @GetMapping("/findAll")
    public List<Resenas> findAll(){
        return resenasService.findAll();
    }

    @PostMapping("/create")
    public Resenas crearResena(@RequestBody Resenas resenas){
        return resenasService.crearResena(resenas);
    }

    @DeleteMapping("/delete")
    public void borrarResena(@RequestBody Resenas resenas){
        resenasService.borrarResena(resenas);
    }

    @PutMapping("/edit")
    public Resenas editarResena(@RequestBody Resenas resenas){
        return resenasService.editarResena(resenas);
    }
    
}
