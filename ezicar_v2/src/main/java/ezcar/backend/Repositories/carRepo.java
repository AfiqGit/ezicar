package ezcar.backend.Repositories;

import org.springframework.data.repository.CrudRepository;

import ezcar.backend.Model.Car;

public interface carRepo extends CrudRepository<Car, Integer>{
    public java.util.List<Car> findByCarType(String carType);
    public java.util.List<Car> findByCarStatus(String carStatus);
}