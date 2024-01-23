package priam.actor.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@lombok.Data
@Table(name = "DataSubject")
public class DataSubject {

    @Id
    private int dataSubjectId;
    private String idRef;
    private String username;
    private String password;
    private int age;

    @JsonBackReference(value = "dataSubject_list")
    @ManyToOne
    private DataSubjectCategory dataSubjectCategory;
}
