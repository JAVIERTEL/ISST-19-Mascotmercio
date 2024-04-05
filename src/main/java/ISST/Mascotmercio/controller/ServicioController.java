package ISST.Mascotmercio.controller;

import ISST.Mascotmercio.entity.Servicio;
import ISST.Mascotmercio.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/servicio")
@CrossOrigin(origins = "http://localhost:3000")
public class ServicioController {

    @Autowired
    ServicioService servicioService;

    @GetMapping("/findAll")
    public List<Servicio> findAll(){
        return servicioService.findAll();
    }

    @PostMapping
    public Servicio createServicio(@RequestBody Servicio servicio) {
        return servicioService.createServicio(servicio);
    }

    @PutMapping("/{id}")
    public Servicio updateServicio(@PathVariable Long id, @RequestBody Servicio servicio) {
        // Verifica si el servicio con el ID proporcionado existe antes de actualizarlo
        servicio.setIdServicio(id);
        return servicioService.updateServicio(servicio);
    }
    
    @DeleteMapping("/{id}")
    public void deleteServicio(@PathVariable Long id) {
        servicioService.deleteServicio(id);
    }



}
