package pl.pjatk.JakZur.Zajecia2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
public class PojoConfig {

    @Bean
    public Pojo BeanPojo(@Value("${my.custom.property:default_value}") String s) {
        return new Pojo(s);
    }

    @Bean
    @ConditionalOnProperty(prefix = "some.not.true", name="value", havingValue = "true")
    public Pojo BeanPojo2(@Value("${my.custom.property}") String s) {
        return new Pojo(s);
    }

    @Bean
    public List<String> defaultData() {
        return List.of("Some stupid string to return");
    }
}
