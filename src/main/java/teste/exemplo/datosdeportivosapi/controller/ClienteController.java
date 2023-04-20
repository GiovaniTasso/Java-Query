package teste.exemplo.datosdeportivosapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teste.exemplo.datosdeportivosapi.model.entity.Personalizado;
import teste.exemplo.datosdeportivosapi.service.ClienteService;

import java.util.Collection;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;


    @GetMapping(value = "/ri/protocolo/{protocolo}")
    public ResponseEntity<Collection<Personalizado>> getbyID(@PathVariable Long protocolo){
        Collection<Personalizado> personalizado = clienteService.getbyID(protocolo);
        if (personalizado == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(personalizado);
    }

    @GetMapping
    public Collection<Personalizado> list(){
        return clienteService.findallprotocolos();
    }

}





