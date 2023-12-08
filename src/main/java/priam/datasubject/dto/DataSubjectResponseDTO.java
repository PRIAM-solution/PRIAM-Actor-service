package priam.datasubject.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import priam.datasubject.entities.DSCategory;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
public class DataSubjectResponseDTO {
    private int id;
    private int age;
    private String idRef;
    private String username;
    private String password;
    private int dscId;
    private String dscName;
}
