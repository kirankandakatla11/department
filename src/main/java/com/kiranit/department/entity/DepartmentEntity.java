package com.kiranit.department.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
@Getter
@Setter
public class DepartmentEntity {
    @Id
    private int depId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String address;

}
