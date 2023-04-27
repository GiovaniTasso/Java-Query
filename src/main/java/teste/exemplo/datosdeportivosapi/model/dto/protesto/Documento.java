package teste.exemplo.datosdeportivosapi.model.dto.protesto;

import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public interface Documento {

    @Value("#{target.cd_protocolo}")
    Long getprotocolo();
    @Value("#{target.nm_andamento}")
    String getnmAndamento();
    @Value("#{target.dt_andamento}")
    LocalDate getdtAndamento();
    @Value("#{target.hr_andamento}")
    LocalTime gethrAndamento();
    String getnmArquivo();
}

