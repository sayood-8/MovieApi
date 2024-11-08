package dev.sayed.MovieApi.model;

public record MovieRecord(
    String name,
    Integer year,
    Integer runTime,
    String [] category ,
    String release_date,
    String director,
    String [] writer,
    String [] actors,
    String storyLine
) {}
