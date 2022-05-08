package pl.pjatk.JakZur.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.JakZur.Model.Car;

@RestController
@RestControllerAdvice
@RequestMapping("/homework")
public class ControllerHomework {

//    @GetMapping("/hello")
//    public String hello() {
//        return "Hello";
//    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleException(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad request! Mesage: " + ex.getLocalizedMessage());
    }

    @GetMapping({"/", "/{value}"})

    public ResponseEntity<String> TwoValue(@RequestParam(required = false) String reqParam, @PathVariable(required = false) String value) {
        return ResponseEntity.ok(reqParam + " " + value);
    }

    @PutMapping({"/", "/{id}"})
    public String updateCar(@RequestBody(required = false) Car reqParamCar, @PathVariable(required = false) Long id) {
        return reqParamCar + " with id: " + id;
    }

    @PostMapping("/postcar")
    public Car newCar(@RequestBody Car car) {
        return car;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteCar(@PathVariable("id") Long id) {
        return ResponseEntity.ok().build();
    }

}
