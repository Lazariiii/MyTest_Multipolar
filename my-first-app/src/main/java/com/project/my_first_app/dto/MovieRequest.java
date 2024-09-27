package com.project.my_first_app.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieRequest {
    private int id;
    private float rating;
    private String title,genre,duration, director;
}
