package teste.exemplo.datosdeportivosapi.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import teste.exemplo.datosdeportivosapi.model.dto.andamento.Andamento;
import teste.exemplo.datosdeportivosapi.model.dto.protesto.Documento;
import teste.exemplo.datosdeportivosapi.model.dto.protesto.Protesto;
import teste.exemplo.datosdeportivosapi.repository.andamento.AndamentoRepository;
import teste.exemplo.datosdeportivosapi.repository.protesto.ProtestoRepository;

import java.util.Collection;


@Service
public class AndamentoService {

    @Autowired
    AndamentoRepository andamentoRepository;
    @Autowired
    ProtestoRepository protestoRepository;



    public Collection<Andamento> getAndamentobyProtocolo(Long protocolo) {

        return andamentoRepository.findAllAndamentoByProtocolo(protocolo);
    }

    public Collection<Andamento> getCertidaoByProtocolo(Long protocolo){
        return andamentoRepository.findAllCertidaobyProtocolo(protocolo);
    }

    public Collection<Protesto> getProtestoByProtocolo(Long protocolo){
        return protestoRepository.findAllProtestoByProtocolo(protocolo);
    }

    public Collection<Documento> getDocumentoByProtocolo(Long protocolo){
        return protestoRepository.findAllDocumentoByProtocolo(protocolo);
    }
}








