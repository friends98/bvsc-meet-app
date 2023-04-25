package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tblResult_Feedback")
@Getter
@Setter
public class Result_Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;
    
    @Column(name = "id_feedback")
    private String id_feedback;

    @Column(name = "id_user")
    private String id_user;

    @Column(name = "status")
    private Integer status;
}