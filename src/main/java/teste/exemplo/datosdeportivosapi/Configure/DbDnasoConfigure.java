package teste.exemplo.datosdeportivosapi.Configure;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import teste.exemplo.datosdeportivosapi.model.entity.protestoclass.ProtestoClass;
import teste.exemplo.datosdeportivosapi.repository.protesto.ProtestoRepository;

import javax.sql.DataSource;
@Configuration
@EnableJpaRepositories(entityManagerFactoryRef = "dnasoEntityManager", basePackageClasses = ProtestoRepository.class)
@EnableTransactionManagement
public class DbDnasoConfigure {

    @Bean
    @ConfigurationProperties(prefix = "dnaso.datasource")
    public DataSource dnasoDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean dnasoEntityManager(
            EntityManagerFactoryBuilder builder,
            @Qualifier("dnasoDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages(ProtestoClass.class)
                .build();

    }
}