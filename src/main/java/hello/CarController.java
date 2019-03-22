package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private static final String manufacturer = "lamborghini";
    private static final String name = "Aventador";

    @RequestMapping("/hello")
    public Car car(){
        return new Car(manufacturer, name);

    }
}
