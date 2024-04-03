package ISST.Mascotmercio.controller;

import java.util.List;
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

import ISST.Mascotmercio.entity.Tienda;
import ISST.Mascotmercio.service.TiendaService;

@RestController
@RequestMapping("api/tienda")
@CrossOrigin(origins = "http://localhost:3000")
public class TiendaController {

    @Autowired
    TiendaService tiendaService;
 
    @GetMapping("/findAll")
    public List<Tienda> findAll(){
        return tiendaService.findAll();
    }

    
    @PostMapping
    public Tienda createTienda(@RequestBody Tienda tienda) {
        return tiendaService.createTienda(tienda);
    }

    @PutMapping("/{id}")
    public Tienda updateTienda(@PathVariable Long id, @RequestBody Tienda tienda) {
        // Verifica si el servicio con el ID proporcionado existe antes de actualizarlo
        tienda.setIdTienda(id);
        return tiendaService.updateTienda(tienda);
    }
    
    @DeleteMapping("/{id}")
    public void deleteTienda(@PathVariable Long id) {
        tiendaService.deleteTienda(id);
    }

}
