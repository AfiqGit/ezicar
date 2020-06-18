package ezcar.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ezcar.backend.Model.Car;
import ezcar.backend.Repositories.carRepo;

@RestController
public class carController {
    @Autowired
    private carRepo carRepo;

    @GetMapping(path="/car")
    public @ResponseBody Iterable<Car> getAllUsers() {
        // This returns a JSON or XML with the users
        return carRepo.findAll();
    }

    @RequestMapping("/car/{carId}")
    public Car getUserbyId(@PathVariable Integer carId) {
        return carRepo.findById(carId).orElse(new Car());
    }

    @RequestMapping(method = RequestMethod.POST, value = "/car")
    public void addUser(@RequestBody Car car) {
        carRepo.save(car);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/car/{carId}")
    public void deleteUser(@PathVariable Integer carId) {
        carRepo.deleteById(carId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/car")
    public void updateUser(@RequestBody Car car) {
        carRepo.save(car);
    }

    @RequestMapping("/carStatus/{carStatus}")
    public List<Car> getCarStatus(@PathVariable String carStatus) {
        return carRepo.findByCarStatus(carStatus);
    }

    @RequestMapping("/carType/{carType}")
    public List<Car> getCarType(@PathVariable String carType) {
        return carRepo.findByCarType(carType);
    }
}