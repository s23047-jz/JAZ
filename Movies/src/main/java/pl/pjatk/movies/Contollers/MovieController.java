package pl.pjatk.movies.Contollers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.movies.Models.Movie;
import pl.pjatk.movies.Services.MovieService;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.getAllMovies();
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.getMovie(id));
    }

    @PostMapping
    public void addNewMovie(@RequestBody Movie movie) {
        movieService.addNewMovie(movie);
    }

    @PutMapping("/{id}")
    public void updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        movieService.updateMovie(id, movie);
    }

    @DeleteMapping("/{id}")
    public String deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return "Successfully deleted movie with id: "+ id;
    }


}
