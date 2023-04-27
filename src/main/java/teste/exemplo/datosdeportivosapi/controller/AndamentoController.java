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
    public ResponseEntity<Collection<Andamento>> getAndamentobyProtocolo(@PathVariable Long protocolo){
        Collection<Andamento> andamentos = andamentoService.getAndamentobyProtocolo(protocolo);
        if (andamentos == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(andamentos);
    }

    @GetMapping(value = "/ri/certidao/{protocolo}")
    public ResponseEntity<Collection<Andamento>> getCertidaoByProtocolo(@PathVariable Long protocolo){
        Collection<Andamento> andamentos = andamentoService.getCertidaoByProtocolo(protocolo);
        if (andamentos == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(andamentos);
    }


    @GetMapping(value = "/pt/protocolo/{protocolo}")
    public ResponseEntity<Collection<Protesto>> getProtestoByProtocolo(@PathVariable Long protocolo){
        Collection<Protesto> protestos = andamentoService.getProtestoByProtocolo(protocolo);
        if (protestos == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(protestos);
    }

    @GetMapping(value = "/nt/protocolo/{protocolo}")
    public ResponseEntity<Collection<Documento>> getDocumentoByProtocolo(@PathVariable Long protocolo){
        Collection<Documento> protestos = andamentoService.getDocumentoByProtocolo(protocolo);
        if (protestos == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(protestos);
    }



}





