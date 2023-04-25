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
@Table(name = "tblSession")
@Getter
@Setter
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "session_id")
    private String id;

    @Column(name = "id_user")
    private String id_user;

    @Column(name = "start_time")
    private Date start_time;

    @Column(name = "end_time")
    private Date end_time;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "ip_address")
    private String ip_address;

    @Column(name = "browser")
    private String browser;

    @Column(name = "device_type")
    private String device_type;

    @Column(name = "location")
    private String location;
}