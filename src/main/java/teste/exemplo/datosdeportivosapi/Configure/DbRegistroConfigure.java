package teste.exemplo.datosdeportivosapi.Configure;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import teste.exemplo.datosdeportivosapi.model.dto.andamento.Andamento;
import teste.exemplo.datosdeportivosapi.model.entity.andamentoclass.AndamentoClass;
import teste.exemplo.datosdeportivosapi.repository.andamento.AndamentoRepository;

import javax.sql.DataSource;
@Configuration
@EnableJpaRepositories(entityManagerFactoryRef = "registroEntityManager", basePackageClasses = AndamentoRepository.class)
@EnableTransactionManagement
public class DbRegistroConfigure {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "registro.datasource")
    public DataSource registroDataSource(){
        return DataSourceBuilder.create().build();

    }
    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean registroEntityManager(
            EntityManagerFactoryBuilder builder,
            @Qualifier("registroDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages(AndamentoClass.class)
                .build();

    }

}
