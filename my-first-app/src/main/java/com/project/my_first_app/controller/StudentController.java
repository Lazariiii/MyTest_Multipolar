//package com.project.my_first_app.controller;
//
//import com.project.my_first_app.dto.StudentRequest;
//import com.project.my_first_app.entity.Student;
//import com.project.my_first_app.service.impl.StudentService;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/v1")
//public class StudentController {
//
//    private final StudentService ss;
//
//    //method harus public
//    public StudentController(StudentService ss){
//         this.ss=ss;
//    }
//
//    //Membuat API
//    @PostMapping(value= "/add")
//    public String addStudent(@RequestBody StudentRequest r){
//        String output = ss.save(r);
//        return output;
//    }
//    @GetMapping(value = "/get/{id}")
//    public String getDataStudentById(@PathVariable Long id){
//        return ss.get(id);
//    }
//
////    private final StudentService ss;
////    public StudentController(StudentService ss){
////        this.ss = ss;
////    }
////
//
//
//}
