package com.project.my_first_app.service.impl;

import com.project.my_first_app.dto.MovieRequest;
import com.project.my_first_app.entity.Movie;
import com.project.my_first_app.repository.MovieRepository;
import com.project.my_first_app.service.movieService;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class MovieService implements movieService{
    private MovieRepository movierepository;

    public MovieService(MovieRepository mry){
        this.movierepository = mry;
    }
    @Override
    public String save(MovieRequest mr){
        saveToDB(mr);
        return "Succes";
    }
    @Override
    public String get(Long id) {
        Optional<Movie> student = movierepository.findById(id);
        if (student.isPresent()){
            return "Succes";
        }else {
            return "Data Not Found";
        }
    }

    private void saveToDB(MovieRequest mr){
        Movie m = new Movie();

        m.setId(mr.getId());
        m.setTitle(mr.getTitle());
        m.setGenre(mr.getGenre());
        m.setDuration(mr.getDuration());
        m.setDirector(mr.getDirector());
        m.setRating(mr.getRating());

        this.movierepository.save(m);
    }
}
