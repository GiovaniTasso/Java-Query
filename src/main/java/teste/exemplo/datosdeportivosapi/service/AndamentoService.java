package teste.exemplo.datosdeportivosapi.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import teste.exemplo.datosdeportivosapi.model.dto.andamento.Andamento;
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


    public Collection<Andamento> findallprotocolos() {

        return andamentoRepository.findallprotocolos();
    }

    public Collection<Andamento> getbyID(Long protocolo) {
        return andamentoRepository.findAllById(protocolo);

    }

    public Collection<Andamento> findallCertidao(){
        return andamentoRepository.findallcertidao();
    }

    public Collection<Andamento> getCertidaoByid(Long protocolo){
        return andamentoRepository.findAllCertidaobyId(protocolo);
    }

    public Collection<Protesto> findallprotestos(){
        return protestoRepository.findAllProtesto();
    }
    public Collection<Protesto> getProtestoByid(Long protocolo){
        return protestoRepository.findAllProtestoId(protocolo);
    }




}








