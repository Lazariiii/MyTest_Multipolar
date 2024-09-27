package com.project.my_first_app.service;

import com.project.my_first_app.dto.MovieRequest;
public interface movieService {
    String save(MovieRequest mr);

    String get(Long id);
}
