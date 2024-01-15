package priam.actor.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@lombok.Data
public class DataSubjectCategory {
    @Id
    private int dataSubjectCategoryId;

    private String dataSubjectCategoryName;

    //String is temporary
    private String locationId;

    @JsonManagedReference(value = "dataSubject_list")
    @OneToMany(mappedBy ="dataSubjectCategory", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<DataSubject> dataSubjects;
}

