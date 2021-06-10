package com.example.postgresdemo.modelClasses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(generator = "student_generator")
    @SequenceGenerator(
            name="student_generator",
            sequenceName = "student_sequence",
            initialValue = 1,
            allocationSize = 0
    )
    private Long id;

    private String name;
    private String email;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name="group_id",insertable = false,updatable = false)
    @JsonIgnore
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Group group;

    @Column(name = "group_id",nullable = false)
    private Long groupId;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
