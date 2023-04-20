package teste.exemplo.datosdeportivosapi.model.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import teste.exemplo.datosdeportivosapi.model.entity.Cliente;

import lombok.Data;


@Data
@AllArgsConstructor
public class ClienteDTO {

    @Id
    private Long protocolo;
    private String nmAndamento;
    private String dtAndamento;
    private String dtAndamentoArquivo;
    private String hrAndamento;
    private String nmArquivo;

    public ClienteDTO(){

    }
    public ClienteDTO(Cliente cliente){
        this.protocolo = cliente.getProtocolo();
        this.nmAndamento = cliente.getNmAndamento();
        this.dtAndamento = cliente.getDtAndamento();
        this.dtAndamentoArquivo = cliente.getDtAndamentoArquivo();
        this.hrAndamento = cliente.getHrAndamento();
        this.nmArquivo = cliente.getNmArquivo();
    }
}
