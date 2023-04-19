package teste.exemplo.datosdeportivosapi.repository;

import org.springframework.data.jpa.repository.Query;
import teste.exemplo.datosdeportivosapi.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teste.exemplo.datosdeportivosapi.model.entity.Personalizado;


import java.util.Collection;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    @Query(value = "select x.tipo, x.data_entrada, x.hora, x.data_prevista, x.nome\n" +
            "from andamento x\n" +
            "inner join prenotacao y\n" +
            "on x.protocolo = y.protocolo"
            , nativeQuery = true)
    Collection<Personalizado> findallprotocolos();


}
