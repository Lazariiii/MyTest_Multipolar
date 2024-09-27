//package com.project.my_first_app.service.impl;
//
//import com.project.my_first_app.dto.StudentRequest;
//import com.project.my_first_app.entity.Student;
//import com.project.my_first_app.repository.StudentRepository;
//import com.project.my_first_app.service.studentService;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class StudentService implements studentService {
//
//    private StudentRepository studentrepository;
//
//    public StudentService(StudentRepository sry){
//        this.studentrepository = sry;
//    }
//
//    @Override
//    public String save(StudentRequest sr){
//        saveToDB(sr);
//        return "Succes";
//    }
//
//    @Override
//    public String get(Long id) {
//        Optional<Student> student = studentrepository.findById(id);
//        if (student.isPresent()){
//            return "Succes";
//        }else {
//            return "Data Not Found";
//        }
//    }
//
//    private void saveToDB(StudentRequest sr){
//        Student s = new Student();
//
//        s.setName(sr.getName());
//        s.setDob(sr.getDob());
//        s.setDepartment(sr.getDepartment());
//        s.setMataKuliah(sr.getMataKuliah());
//
//        this.studentrepository.save(s);
//    }
//}
