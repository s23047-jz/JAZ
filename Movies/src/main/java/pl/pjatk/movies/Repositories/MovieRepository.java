package pl.pjatk.movies.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.movies.Models.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
