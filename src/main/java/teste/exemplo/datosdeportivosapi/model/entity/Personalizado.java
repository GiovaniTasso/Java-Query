package teste.exemplo.datosdeportivosapi.model.entity;

import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;

public interface Personalizado {



     @Value("#{target.tipo}")
     String getnmAndamento();
     @Value("#{target.data_entrada}")
     LocalDateTime getdtAndamento();
     @Value("#{target.data_prevista}")
     LocalDateTime getdtAndamentoArquivo();
     @Value("#{target.hora}")
     String gethrAndamento();
     @Value("#{target.nome}")
     String getnmArquivo();


}
