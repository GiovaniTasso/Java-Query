package teste.exemplo.datosdeportivosapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teste.exemplo.datosdeportivosapi.model.entity.Personalizado;
import teste.exemplo.datosdeportivosapi.repository.ClienteRepository;

import java.util.Collection;


@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;


    public Collection<Personalizado> findallprotocolos() {

        return clienteRepository.findallprotocolos();
    }

    public Collection<Personalizado> getbyID(Long protocolo) {
        return clienteRepository.findAllById(protocolo);

    }





}








