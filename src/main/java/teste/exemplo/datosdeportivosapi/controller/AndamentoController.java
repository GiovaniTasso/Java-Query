package teste.exemplo.datosdeportivosapi.controller;

import jakarta.servlet.http.PushBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teste.exemplo.datosdeportivosapi.model.dto.andamento.Andamento;
import teste.exemplo.datosdeportivosapi.model.dto.protesto.Documento;
import teste.exemplo.datosdeportivosapi.model.dto.protesto.Protesto;
import teste.exemplo.datosdeportivosapi.service.AndamentoService;

import java.util.Collection;

@RestController
@RequestMapping("/cliente")
public class AndamentoController {

    @Autowired
    private AndamentoService andamentoService;


    @GetMapping(value = "/ri/protocolo/{protocolo}")
    public ResponseEntity<Collection<Andamento>> getbyID(@PathVariable Long protocolo){
        Collection<Andamento> andamentos = andamentoService.getbyID(protocolo);
        if (andamentos == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(andamentos);
    }

    @GetMapping
    public Collection<Andamento> list(){
        return andamentoService.findallprotocolos();
    }

    @GetMapping(value = "/certidao")
    public Collection<Andamento> listcertidao(){
        return andamentoService.findallCertidao();
    }

    @GetMapping(value = "/ri/certidao/{protocolo}")
    public ResponseEntity<Collection<Andamento>> getCertidaoByid(@PathVariable Long protocolo){
        Collection<Andamento> andamentos = andamentoService.getCertidaoByid(protocolo);
        if (andamentos == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(andamentos);
    }

    @GetMapping(value = "/protesto")
    public Collection<Protesto> listaprotesto(){

        return andamentoService.findallprotestos();
    }

    @GetMapping(value = "/pt/protocolo/{protocolo}")
    public ResponseEntity<Collection<Protesto>> getProtestoByid(@PathVariable Long protocolo){
        Collection<Protesto> protestos = andamentoService.getProtestoByid(protocolo);
        if (protestos == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(protestos);
    }

    @GetMapping(value = "/nt/protocolo")
    public Collection<Documento> listadocumento(){
        return andamentoService.findalldocumentos();
    }

    @GetMapping(value = "/nt/protocolo/{protocolo}")
    public ResponseEntity<Collection<Documento>> getDocumentoById(@PathVariable Long protocolo){
        Collection<Documento> protestos = andamentoService.getDocumentoByid(protocolo);
        if (protestos == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(protestos);
    }



}





