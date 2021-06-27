package pl.sda.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.sda.dto.PersonValidatorType;
import pl.sda.service.FieldValidator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan("pl.sda")
public class ApplicationConfiguration {

    @Autowired
    private List<FieldValidator> fieldValidators;

    @Bean
    public Map<PersonValidatorType, FieldValidator> fieldValidatorMap() {
        Map<PersonValidatorType, FieldValidator> map = new HashMap<>();
        fieldValidators.forEach(t -> map.put(t.getType(), t));
        return map;
    }

}
