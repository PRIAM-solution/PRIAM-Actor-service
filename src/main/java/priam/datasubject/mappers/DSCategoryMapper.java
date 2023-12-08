package priam.datasubject.mappers;

import org.mapstruct.Mapper;
import priam.datasubject.dto.DSCategoryResponseDTO;
import priam.datasubject.dto.DataSubjectResponseDTO;
import priam.datasubject.entities.DSCategory;
import priam.datasubject.entities.DataSubject;

@Mapper(componentModel = "spring")
public interface DSCategoryMapper {
    DSCategoryResponseDTO DSCategoryToDSCategoryResponseDTO(DSCategory dsCategory);
}
