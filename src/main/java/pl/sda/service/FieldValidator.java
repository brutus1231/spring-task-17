package pl.sda.service;

import pl.sda.dto.PersonDto;

public interface FieldValidator {

    boolean isValid(PersonDto person);
}
