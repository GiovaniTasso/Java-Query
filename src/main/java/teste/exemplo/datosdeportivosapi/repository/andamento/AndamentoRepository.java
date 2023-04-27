package teste.exemplo.datosdeportivosapi.repository.andamento;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import teste.exemplo.datosdeportivosapi.model.dto.andamento.Andamento;
import teste.exemplo.datosdeportivosapi.model.entity.andamentoclass.AndamentoClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Collection;


@Repository
public interface AndamentoRepository extends JpaRepository<AndamentoClass,Long> {


    @Query(value = "select x.tipo, x.data_entrada, x.hora, x.data_prevista, y.protocolo " +
            "from andamento x " +
            "inner join prenotacao y " +
            "on x.protocolo = y.protocolo " +
            "where y.protocolo = :protocolo " +
            "order by x.data_entrada, x.hora",
            nativeQuery = true)
    Collection<Andamento> findAllAndamentoByProtocolo(@Param("protocolo") Long protocolo);


    @Query(value = "select a.tipo, a.data_entrada, a.hora, a.data_prevista, c.protocolo " +
            "from certidao c " +
            "inner join andamento_certidao a " +
            "on a.protocolo = c.protocolo " +
            "where a.protocolo = :protocolo " +
            "order by a.data_entrada, a.hora"
            , nativeQuery = true)
    Collection<Andamento> findAllCertidaobyProtocolo(@Param("protocolo") Long protocolo);





}
