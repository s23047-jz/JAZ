package pl.pjatk.JakZur.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.JakZur.Model.Car;

@RestController
@RequestMapping("/test")
public class Controller {

//    @GetMapping("/hello")
//    ResponseEntity<String> hello() {
//        return new ResponseEntity<>("Hello world", HttpStatus.OK);
//    }

    @GetMapping("/hello/{someValue}")
    ResponseEntity<String> yourValue(@PathVariable String someValue) {
        return new ResponseEntity<>(someValue, HttpStatus.OK);
    }

    @GetMapping("/hello")
    ResponseEntity<String> yourValue2(@RequestParam String reqParam) {
        return new ResponseEntity<>("RequestParam: "+reqParam, HttpStatus.OK);
    }

    @GetMapping("/car")
    Car getCar() {
        return new Car("Audi", "A4", 2.0, 5);
    }

    @PostMapping("/model")
    Car createCar(@RequestBody Car car) {
        return car;
    }
}
