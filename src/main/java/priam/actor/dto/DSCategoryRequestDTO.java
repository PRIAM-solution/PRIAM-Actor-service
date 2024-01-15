package priam.actor.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
public class DSCategoryRequestDTO {
    private String dataSubjectCategoryName;
    private String locationId;
}
