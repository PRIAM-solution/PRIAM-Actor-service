package priam.datasubject.web;

import org.springframework.web.bind.annotation.*;
import priam.datasubject.dto.DSCategoryResponseDTO;
import priam.datasubject.dto.DataSubjectResponseDTO;
import priam.datasubject.entities.DataSubject;
import priam.datasubject.mappers.DataSubjectMapper;
import priam.datasubject.services.DataSubjectService;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DataSubjectRestAPI {

    private DataSubjectService dataSubjectService;
    private DataSubjectMapper dataSubjectMapper;

    public DataSubjectRestAPI(DataSubjectService dataSubjectService) {
        this.dataSubjectService = dataSubjectService;
    }

    @GetMapping(path = "/DataSubject/{id}")
    public DataSubjectResponseDTO getDataSubjectId(@PathVariable int id) {
        return dataSubjectService.findDataSubject(id);
    }

   @GetMapping(path = "/DataSubject/ref:{idRef}")
    public DataSubjectResponseDTO getDataSubjectByRef(@PathVariable String idRef) {
        return dataSubjectService.getDataSubjectByIdRef(idRef);
    }

    @GetMapping(path = "/DSCategory/{dscId}")
    public DSCategoryResponseDTO getDSCategoryById(@PathVariable int dscId) {
        return dataSubjectService.getDataSubjectCategoryById(dscId);
    }
}
