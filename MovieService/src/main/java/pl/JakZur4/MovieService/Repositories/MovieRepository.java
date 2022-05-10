package pl.JakZur4.MovieService.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.JakZur4.MovieService.Model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
