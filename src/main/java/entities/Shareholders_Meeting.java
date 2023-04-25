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
@Table(name = "tblShareholders_Meeting")
@Getter
@Setter
public class Shareholders_Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;
    @Column(name = "id_company")
    private String id_company;
    @Column(name = "number_organized")
    private Integer number_organized;
    @Column(name = "year_organized")
    private Timestamp year_organized;
    @Column(name = "status")
    private Integer status;
    @Column(name = "image_banner")
    private String image_banner;
    @Column(name = "start_time")
    private Timestamp start_time;
    @Column(name = "end_time")
    private Timestamp end_time;
    @Column(name = "address")
    private String address;

    
}