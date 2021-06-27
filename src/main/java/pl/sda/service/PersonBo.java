package pl.sda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.sda.dto.PersonDto;

import java.util.List;

@Component
public class PersonBo {

    private final List<FieldValidator> personValidators;

    @Autowired
    public PersonBo(List<FieldValidator> personValidators) {
        this.personValidators = personValidators;
    }

    public void save(PersonDto person) {
        System.out.println("Próba zapisu osoby");
        if (!isPersonValid(person)) {
            System.out.println("Walidacja osoby niepoprawna");
            return;
        }
        System.out.println("Zapisano osobę");
    }

    private boolean isPersonValid(PersonDto person) {
        for (FieldValidator fieldValidator : personValidators) {
            if (!fieldValidator.isValid(person)) {
                return false;
            }
        }
        return true;
    }
}
