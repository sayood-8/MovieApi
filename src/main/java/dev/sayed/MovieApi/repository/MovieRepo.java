package dev.sayed.MovieApi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dev.sayed.MovieApi.model.MovieRecord;

@Repository
public class MovieRepo {
 List<MovieRecord> movie = new ArrayList<>(); 
    
}
