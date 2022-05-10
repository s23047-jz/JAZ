package pl.JakZur4.MovieService.Model;

public class Movie {
    private Double id;
    private String title;
    private String movieCategory;

    public Movie(String title, String movieCategory) {
        this.title = title;
        this.movieCategory = movieCategory;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }
}
