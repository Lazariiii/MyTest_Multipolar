//package com.project.my_first_app.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.annotations.CreationTimestamp;
//
//import java.time.OffsetDateTime;
//
//@Entity
//@Table(name ="student")
//@Getter
//@Setter
//@Data
//public class Student {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @Column(name = "name") //nama di database
//    private String name;
//
//    @Column(name = "dob")
//    private int dob;
//
//    @Column(name = "mother_name")
//    private String motherName;
//
//    @Column(name = "gender")
//    private String gender;
//
//    @Column(name = "department")
//    private String department;
//
//    @Column(name = "mataKuliah")
//    private String mataKuliah;
//
//    @CreationTimestamp
//    @Column(name = "created_at", nullable = false, updatable = false)
//    private OffsetDateTime createdAt;
//
//    @CreationTimestamp
//    @Column(name = "modified_at")
//    private OffsetDateTime modifiedAt;
//
//
//
//}
