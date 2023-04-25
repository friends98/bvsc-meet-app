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
@Table(name = "tblUser_Info")
@Getter
@Setter
public class User_Info {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;

    @Column(name = "login_id")
    private String login_id;
    
    @Column(name = "password")
    private String password;

    @Column(name = "id_meeting")
    private String id_meeting;

    @Column(name = "id_shareholder")
    private String id_shareholder;

    @Column(name = "status")
    private Integer status;
    
    @Column(name = "number_shares")
    private Integer number_shares;

    @Column(name = "number_authorized_shares")
    private Integer number_authorized_shares;

    @Column(name = "role")
    private Integer role;

    
}