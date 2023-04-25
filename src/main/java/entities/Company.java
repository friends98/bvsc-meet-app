package entities;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tblCompany")
@Getter
@Setter
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "stock_code")
    private String stock_code;
    @Column(name = "tax_code")
    private Integer tax_code;
    @Column(name = "address")
    private String address;
    @Column(name = "image_logo")
    private String image_logo;
    @Column(name = "founded_year")
    private Date founded_year;
    

    
}