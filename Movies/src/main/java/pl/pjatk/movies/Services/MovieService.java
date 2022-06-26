package pl.pjatk.movies.Services;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pl.pjatk.movies.Models.Movie;
import pl.pjatk.movies.Repositories.MovieRepository;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovie(Long id) {
        if(movieRepository.findById(id).get() == null) {
            throw new RuntimeException();
        } else {
            return movieRepository.findById(id).get() ;
        }
    }

    public Movie addNewMovie(Movie movie) {
        if(movie.getTitle() == null || movie.getCategory() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return movieRepository.save(movie);
    }

    public Movie updateMovie(Long id, Movie movie) {
        if(movieRepository.findById(id).get() == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        Movie updatingMovie = movieRepository.findById(id).get();
        updatingMovie.setTitle(movie.getTitle());
        updatingMovie.setCategory(movie.getCategory());
        return movieRepository.save(updatingMovie);
    }

    public void deleteMovie(Long id) {
        if(movieRepository.findById(id).get() == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        Movie deletingMovie = movieRepository.findById(id).get();
        movieRepository.delete(deletingMovie);
    }
}
