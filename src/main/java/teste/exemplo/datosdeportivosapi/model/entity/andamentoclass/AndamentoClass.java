package teste.exemplo.datosdeportivosapi.model.entity.andamentoclass;

import jakarta.persistence.*;
import lombok.*;


@Data
@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AndamentoClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long protocolo;
    private String nmAndamento;
    private String dtAndamento;
    private String dtAndamentoArquivo;
    private String hrAndamento;
    private String nmArquivo;


}

