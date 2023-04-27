package teste.exemplo.datosdeportivosapi.repository.protesto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import teste.exemplo.datosdeportivosapi.model.dto.protesto.Documento;
import teste.exemplo.datosdeportivosapi.model.dto.protesto.Protesto;
import teste.exemplo.datosdeportivosapi.model.entity.protestoclass.ProtestoClass;

import java.util.Collection;
@Repository
public interface ProtestoRepository extends JpaRepository<ProtestoClass, Long> {



    @Query(value = "select x.nm_andamento, x.dt_andamento, x.cd_titulo_andamento , y.cd_protocolo " +
            "from db_protesto.tb_titulo_andamento x " +
            "inner join db_protesto.tb_titulo y " +
            "on x.cd_protocolo = y.cd_protocolo " +
            "where x.cd_protocolo = :protocolo " +
            "order by x.dt_andamento, x.cd_titulo_andamento ASC", nativeQuery = true)
    Collection<Protesto> findAllProtestoByProtocolo(@Param("protocolo") Long protocolo);


    @Query(value = "select y.nm_andamento, y.dt_andamento, y.hr_andamento, x.cd_protocolo " +
            "from db_notas.tb_documento x " +
            "join db_notas.tb_documento_andamento y " +
            "on y.cd_documento = x.cd_documento " +
            "where x.cd_protocolo = :protocolo * 100 " +
            "ORDER BY y.dt_andamento, y.hr_andamento ASC;", nativeQuery = true)
    Collection<Documento> findAllDocumentoByProtocolo(@Param("protocolo")Long protocolo);




}
