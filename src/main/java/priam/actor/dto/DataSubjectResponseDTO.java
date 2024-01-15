package priam.actor.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import priam.actor.entities.DataSubjectCategory;

@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
public class DataSubjectResponseDTO {
    private int dataSubjectId;
    private String referenceId;
    private int age;
    private DataSubjectCategory dataSubjectCategory;
}
