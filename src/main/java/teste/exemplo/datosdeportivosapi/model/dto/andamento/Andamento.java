package teste.exemplo.datosdeportivosapi.model.dto.andamento;

import org.springframework.beans.factory.annotation.Value;
import java.time.LocalDateTime;

public interface Andamento {



    @Value("#{target.tipo}")
    String getnmAndamento();
    @Value("#{target.data_entrada}")
    LocalDateTime getdtAndamento();
    @Value("#{target.data_prevista}")
    LocalDateTime getdtAndamentoArquivo();
    @Value("#{target.hora}")
    String gethrAndamento();
    String getnmArquivo();
}
