package pl.sda.service;

import pl.sda.dto.PersonDto;
import pl.sda.dto.PersonValidatorType;

public interface FieldValidator {

    boolean isValid(PersonDto person);

    PersonValidatorType getType();
}
