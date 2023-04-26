package teste.exemplo.datosdeportivosapi.model.entity.protestoclass;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProtestoClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long protocolo;
    private String nmAndamento;
    private String dtAndamento;
    private String hrAndamento;
    private String nmArquivo;


}
