package ezcar.backend.Repositories;

import org.springframework.data.repository.CrudRepository;
import ezcar.backend.Model.User;

public interface userRepo extends CrudRepository<User, Integer>{
}