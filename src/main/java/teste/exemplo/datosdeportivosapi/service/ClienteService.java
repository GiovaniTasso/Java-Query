package teste.exemplo.datosdeportivosapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teste.exemplo.datosdeportivosapi.model.dto.ClienteDTO;
import teste.exemplo.datosdeportivosapi.model.entity.Cliente;
import teste.exemplo.datosdeportivosapi.model.entity.Personalizado;
import teste.exemplo.datosdeportivosapi.model.form.ClienteForm;
import teste.exemplo.datosdeportivosapi.repository.ClienteRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;


    public Collection<Personalizado> findallprotocolos() {
        return clienteRepository.findallprotocolos();
    }


    public ClienteDTO createCliente(ClienteForm form) {
        Cliente cliente = convertToRequest(form);
        cliente = clienteRepository.save(cliente);
        return convertToResponse(cliente);
    }

    public List<ClienteDTO> findAllCliente() {
        List<Cliente> all = clienteRepository.findAll();
        return convertListToResponse(all);

    }

    public ClienteDTO findClienteById(Long id){
        Optional<Cliente> optional = clienteRepository.findById(id);
        return optional.map(this::convertToResponse).orElse(null);
    }

    public void deleteById(Long id){
        if(clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
        }
    }

    private Cliente convertToRequest(ClienteForm form) {
        Cliente cliente = new Cliente();
        cliente.setId(form.getId());
        cliente.setDtAndamento(form.getDtAndamento());
        cliente.setHrAndamento(form.getHrAndamento());
        cliente.setDtAndamentoArquivo(form.getDtAndamentoArquivo());
        cliente.setNmAndamento(form.getNmAndamento());
        cliente.setNmArquivo(form.getNmArquivo());
        return cliente;
    }

    private ClienteDTO convertToResponse(Cliente cliente) {
        ClienteDTO dto = new ClienteDTO();
        dto.setId(cliente.getId());
        dto.setDtAndamento(cliente.getDtAndamento());
        dto.setHrAndamento(cliente.getHrAndamento());
        dto.setDtAndamentoArquivo(cliente.getDtAndamentoArquivo());
        dto.setNmAndamento(cliente.getNmAndamento());
        dto.setNmArquivo(cliente.getNmArquivo());
        return dto;

    }

    private static List<ClienteDTO> convertListToResponse(List<Cliente> clientes){
        return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
    }

}








