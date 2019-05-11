package pl.itacademy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import pl.itacademy.dao.StudentDao;
import pl.itacademy.dao.StudentJdbcDao;
import pl.itacademy.service.StudentService;

@Configuration
@ComponentScan("pl.itacademy")
//@ImportResource({ "classpath:application.xml" })
public class AppConfig {
/*    @Bean
    public StudentDao studentDao() {
        return new StudentJdbcDao();
    }

    @Bean
    public StudentService studentService() {
        return new StudentService(studentDao());
    }*/
}
