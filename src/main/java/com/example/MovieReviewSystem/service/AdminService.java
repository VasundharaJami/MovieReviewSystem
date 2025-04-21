package com.example.MovieReviewSystem.service;

import com.example.MovieReviewSystem.domain.Movie;
import com.example.MovieReviewSystem.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private MovieRepository movieRepository;

    //constructor injection
    public AdminService(MovieRepository movieRepository) {

        this.movieRepository = movieRepository;
    }

    public Movie addMovie(Movie movie){

        return movieRepository.save(movie);
    }
}
