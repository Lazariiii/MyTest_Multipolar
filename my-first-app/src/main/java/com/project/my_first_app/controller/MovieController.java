package com.project.my_first_app.controller;
import com.project.my_first_app.dto.MovieRequest;
import com.project.my_first_app.entity.Movie;
import com.project.my_first_app.service.impl.MovieService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class MovieController {
    private final MovieService ms;

    //method harus public
    public MovieController(MovieService ms){
        this.ms=ms;
    }

    //Membuat API
    @PostMapping(value= "/add")
    public String addStudent(@RequestBody MovieRequest r){
        String output = ms.save(r);
        return output;
    }
    @GetMapping(value = "/get/{id}")
    public String getDataMovieById(@PathVariable Long id){
        return ms.get(id);
    }
}
