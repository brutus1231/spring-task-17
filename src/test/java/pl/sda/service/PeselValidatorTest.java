package pl.sda.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.dto.PersonDto;

import static org.junit.jupiter.api.Assertions.*;

class PeselValidatorTest {

    @Test
    void isValid() {
        PersonDto personDto = PersonDto.builder().pesel("WRONG_PESEL").build();
        PeselValidator peselValidator = new PeselValidator();
        boolean result = peselValidator.isValid(personDto);
        Assertions.assertFalse(result);
    }
}