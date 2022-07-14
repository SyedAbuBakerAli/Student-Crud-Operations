package com.project.demo.Entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Data
@Entity
public class StudentEntity  implements Serializable {
    @Id
    private Integer studentId;
    private String studentName;
    private Integer age;
    private String address;
    private String course;
}
