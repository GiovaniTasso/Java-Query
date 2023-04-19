package teste.exemplo.datosdeportivosapi.controller;

import java.util.Collection;
import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import teste.exemplo.datosdeportivosapi.model.dto.ClienteDTO;
import teste.exemplo.datosdeportivosapi.model.entity.Personalizado;
import teste.exemplo.datosdeportivosapi.model.form.ClienteForm;
import teste.exemplo.datosdeportivosapi.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ClienteDTO salvar(@RequestBody @Valid ClienteForm clienteForm){
        return clienteService.createCliente(clienteForm);
    }
    //@GetMapping
    //public List<ClienteDTO> list(){
    //    return clienteService.findAllCliente();
   // }

    @GetMapping("/{id}")
    public ClienteDTO findById(@PathVariable("id") Long id){
        return clienteService.findClienteById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id){
        clienteService.deleteById(id);
    }

    @GetMapping
    public Collection<Personalizado> list(){

        return clienteService.findallprotocolos();
    }

}





