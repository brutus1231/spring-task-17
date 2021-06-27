package pl.sda.service;

import org.springframework.stereotype.Component;
import pl.sda.dto.PersonDto;
import pl.sda.dto.PersonValidatorType;

@Component
public class EmailValidator implements FieldValidator {

    @Override
    public boolean isValid(PersonDto person) {
        String email = person.getEmail();
        if (email == null || email.isEmpty()) {
            return false;
        }
        return email.matches("^[a-zA-Z]+(@){1}[a-zA-Z0-9._-]+$");
    }

    @Override
    public PersonValidatorType getType() {
        return PersonValidatorType.EMAIL;
    }
}
