package teste.exemplo.datosdeportivosapi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import teste.exemplo.datosdeportivosapi.model.entity.Certidao;
import teste.exemplo.datosdeportivosapi.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teste.exemplo.datosdeportivosapi.model.entity.Personalizado;


import java.util.Collection;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    @Query(value = "select x.tipo, x.data_entrada, x.hora, x.data_prevista, y.protocolo\n" +
            "from andamento x\n" +
            "inner join prenotacao y\n" +
            "on x.protocolo = y.protocolo"
            , nativeQuery = true)
    Collection<Personalizado> findallprotocolos();

    @Query(value = "select x.tipo, x.data_entrada, x.hora, x.data_prevista, y.protocolo\n" +
            "from andamento x\n" +
            "inner join prenotacao y\n" +
            "on x.protocolo = y.protocolo\n" +
            "where y.protocolo = :protocolo",
            nativeQuery = true)
    Collection<Personalizado> findAllById(@Param("protocolo") Long protocolo);

    @Query(value = "select c.protocolo, a.tipo, a.data_entrada, a.hora, a.data_prevista\n" +
            "from certidao c\n" +
            "inner join andamento_certidao a\n" +
            "on a.protocolo = c.protocolo", nativeQuery = true)
    Collection<Certidao> findallcertidao();

    @Query(value = "select c.protocolo, a.tipo, a.data_entrada, a.hora, a.data_prevista\n" +
            "from certidao c\n" +
            "inner join andamento_certidao a\n" +
            "on a.protocolo = c.protocolo\n" +
            "where a.protocolo = :protocolo"
            , nativeQuery = true)
    Collection<Certidao> findAllCertidaobyId(@Param("protocolo") Long protocolo);


}
