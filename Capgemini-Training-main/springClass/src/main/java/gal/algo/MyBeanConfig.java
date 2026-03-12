package gal.algo;

import com.gal.algo.Calc;
import com.gal.algo.MyCalc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MyBeanConfig {

    @Bean
    StringBuilder getStringBuilder(){
        return new StringBuilder("bean from Configuration");
    }

    @Bean
    @Primary
    Calc getCalc(){
        return new MyCalc();
    }

    @Bean(name="getCalcNamedBean")
    Calc getCalc2(){
        return new MyCalc();
    }

    // ⭐ ADD THIS METHOD
    @Bean
    public DataSource dataSource(){

        DriverManagerDataSource ds = new DriverManagerDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/testdb");
        ds.setUsername("root");
        ds.setPassword("root");

        return ds;
    }
}