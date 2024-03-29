package ISST.Mascotmercio.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ISST.Mascotmercio.entity.Tienda;
import ISST.Mascotmercio.service.TiendaService;

@RestController
@RequestMapping("api/tienda")
public class TiendaController {

    @Autowired
    TiendaService tiendaService;
 
    @GetMapping("/findAll")
    public List<Tienda> findAll(){
        return tiendaService.findAll();
    }
}
