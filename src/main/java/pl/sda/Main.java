package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.config.ApplicationConfiguration;
import pl.sda.dto.PersonDto;
import pl.sda.service.PersonBo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        PersonDto personDto = PersonDto.builder().pesel("90101012312").build();
        PersonBo personBo = context.getBean(PersonBo.class);
        personBo.save(personDto);
    }
}
