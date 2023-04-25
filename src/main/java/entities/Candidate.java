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
@Table(name = "tblCandidate")
@Getter
@Setter
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;

    @Column(name = "id_meeting")
    private String id_meeting;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "birthday")
    private Timestamp birthday;

    @Column(name = "address")
    private String address;

    @Column(name = "summary_info")
    private String summary_info;
}