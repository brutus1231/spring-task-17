package pl.sda.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class PersonDto {

    private String firstName;
    private String lastName;
    private String pesel;
    private String email;
}
