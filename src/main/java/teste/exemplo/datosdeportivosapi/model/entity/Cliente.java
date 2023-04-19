package teste.exemplo.datosdeportivosapi.model.entity;

import jakarta.persistence.*;
import lombok.*;


@Data
@Table(name = "cliente")
@Entity(name = "cliente")
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nmAndamento;
    private String dtAndamento;
    private String dtAndamentoArquivo;
    private String hrAndamento;
    private String nmArquivo;


}

