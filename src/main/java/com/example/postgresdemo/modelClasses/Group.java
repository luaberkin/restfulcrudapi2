package com.example.postgresdemo.modelClasses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="groups")
public class Group implements Serializable {

    @Id
    @GeneratedValue(generator = "group_generator")
    @SequenceGenerator(
            name="group_generator",
            sequenceName ="group_sequence",
            initialValue = 1,
            allocationSize = 0
    )
    private Long id;

    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_date",nullable = false,updatable = false)
    @CreatedDate
    private Date created_date;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }
}
