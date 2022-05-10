package pl.JakZur4.MovieService.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pl.JakZur4.MovieService.Model.Movie;
import pl.JakZur4.MovieService.Repositories.MovieRepository;

import java.util.List;


@RestController
@RestControllerAdvice
@RequestMapping("/movies")
public class MovieController {

    public MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movies/{id}")
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id, IllegalArgumentException ex) {
        if(movieRepository.existsById(id)) {
            return ResponseEntity.ok(movieRepository.getById(id));
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Movie not found!", ex);
        }
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.ok(movieRepository.findAll());
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
         try {
             movieRepository.save(movie);
         }catch (Exception ex) {
             return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
         }
        return ResponseEntity.ok(movie);
    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie) {
        try {
            movieRepository.save(movie);
        }catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(movie);
    }
}
