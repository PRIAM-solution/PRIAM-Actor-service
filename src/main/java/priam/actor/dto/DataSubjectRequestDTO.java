package priam.actor.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
public class DataSubjectRequestDTO {
    private int dataSubjectId;
    private String referenceId;
    private int age;
    private int dataSubjectCategoryId;
}
