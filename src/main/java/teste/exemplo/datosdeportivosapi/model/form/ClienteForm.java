package teste.exemplo.datosdeportivosapi.model.form;

import lombok.Data;


@Data
public class ClienteForm {
    private Long protocolo;
    private String nmAndamento;
    private String dtAndamento;
    private String dtAndamentoArquivo;
    private String hrAndamento;
    private String nmArquivo;

}
