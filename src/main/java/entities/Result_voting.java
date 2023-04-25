package entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tblResult_Voting")
@Getter
@Setter
public class Result_Voting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;

    @Column(name = "id_voting")
    private String id_voting;

    @Column(name = "id_user")
    private String id_user;

    @Column(name = "number_shares_for_candidate")
    private Integer number_shares_for_candidate;

    @Column(name = "time_voting")
    private Timestamp time_voting;
}