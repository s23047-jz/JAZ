package pl.pjatk.movies.Contollers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice extends RuntimeException {

    @ExceptionHandler(RuntimeException.class)
    ResponseEntity<String> handlerRuntimeException(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Throw not found: 404");
    }
}
