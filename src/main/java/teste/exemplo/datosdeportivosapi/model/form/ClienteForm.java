package teste.exemplo.datosdeportivosapi.model.form;

import lombok.Data;
import lombok.Value;


@Data
public class ClienteForm {
    private Long id;
    private String nmAndamento;
    private String dtAndamento;
    private String dtAndamentoArquivo;
    private String hrAndamento;
    private String nmArquivo;

}
