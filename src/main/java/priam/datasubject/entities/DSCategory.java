package priam.datasubject.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@lombok.Data
public class DSCategory {
    @Id
    private int dscId;

    private String dscName;

    //String is temporary
    private String locationId;

    @JsonManagedReference
    @OneToMany(mappedBy ="dsCategory", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<DataSubject> dataSubjects;
}

