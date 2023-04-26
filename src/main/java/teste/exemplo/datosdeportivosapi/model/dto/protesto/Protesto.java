package teste.exemplo.datosdeportivosapi.model.dto.protesto;

import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Protesto {

    @Value("#{target.cd_protocolo}")
    Long getprotocolo();
    @Value("#{target.nm_andamento}")
    String getnmAndamento();
    @Value("#{target.dt_andamento}")
    LocalDate getdtAndamento();
    String gethrAndamento();
    String getnmArquivo();
}
