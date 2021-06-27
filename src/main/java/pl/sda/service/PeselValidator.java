package pl.sda.service;

import org.springframework.stereotype.Component;
import pl.sda.dto.PersonDto;
import pl.sda.dto.PersonValidatorType;

@Component
public class PeselValidator implements FieldValidator {

    @Override
    public boolean isValid(PersonDto person) {
        String pesel = person.getPesel();
        if (pesel == null || pesel.isEmpty()) {
            return false;
        }
        return pesel.length() == 11 && pesel.matches("^[0-9]+$");
    }

    @Override
    public PersonValidatorType getType() {
        return PersonValidatorType.PESEL;
    }
}
