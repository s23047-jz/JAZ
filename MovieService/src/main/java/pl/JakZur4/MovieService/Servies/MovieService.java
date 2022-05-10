package pl.JakZur4.MovieService.Servies;

import java.util.Optional;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import pl.JakZur4.MovieService.Model.Movie;
import pl.JakZur4.MovieService.Repositories.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
public class MovieService {
    private MovieRepository movieRepository;
}
