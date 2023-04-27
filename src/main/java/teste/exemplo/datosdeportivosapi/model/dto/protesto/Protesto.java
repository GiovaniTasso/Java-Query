package teste.exemplo.datosdeportivosapi.model.dto.protesto;

import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Protesto {


    @Value("#{target.nm_andamento}")
    String getnmAndamento();
    @Value("#{target.dt_andamento}")
    LocalDate getdtAndamento();
    LocalDateTime gethrAndamento();
    String getnmArquivo();
}
