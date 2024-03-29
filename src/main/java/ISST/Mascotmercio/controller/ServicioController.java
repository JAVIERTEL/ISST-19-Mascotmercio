package ISST.Mascotmercio.controller;

import ISST.Mascotmercio.entity.Servicio;
import ISST.Mascotmercio.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/servicio")
public class ServicioController {

    @Autowired
    ServicioService servicioService;

    @GetMapping("/findAll")
    public List<Servicio> findAll(){
        return servicioService.findAll();
    }
}
