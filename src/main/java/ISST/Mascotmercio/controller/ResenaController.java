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

import ISST.Mascotmercio.entity.Resena;
import ISST.Mascotmercio.service.ResenaService;

@RestController
@RequestMapping("api/resenas")
@CrossOrigin(origins = "http://localhost:3000")
public class ResenaController {

    @Autowired
    ResenaService resenaService;

    @GetMapping("/findAll")
    public List<Resena> findAll(){
        return resenaService.findAll();
    }

    @GetMapping("/findAll/{id}")
    public Resena findById(@RequestBody Long id){
        return resenaService.findById(id);
    }


    @PostMapping
    public Resena crearResena(@RequestBody Resena resena){
        return resenaService.crearResena(resena);
    }

    @DeleteMapping("/{id}")
    public void borrarResena(@RequestBody Long id){
        resenaService.borrarResena(id);
    }

    @PutMapping("/edit")
    public Resena editarResena(@RequestBody Resena resena){
        return resenaService.editarResena(resena);
    }
    
}
