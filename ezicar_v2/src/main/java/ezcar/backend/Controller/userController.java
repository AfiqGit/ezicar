package ezcar.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ezcar.backend.Model.User;
import ezcar.backend.Repositories.userRepo;

@RestController
public class userController {
    @Autowired
    private userRepo userRepo;

    @GetMapping(path="/user")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepo.findAll();
    }

    @RequestMapping("/user/{userId}")
    public User getUserbyId(@PathVariable Integer userId) {
        return userRepo.findById(userId).orElse(new User());
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public void addUser(@RequestBody User user) {
        userRepo.save(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user/{userId}")
    public void deleteUser(@PathVariable Integer userId) {
        userRepo.deleteById(userId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/user")
    public void updateUser(@RequestBody User user) {
        userRepo.save(user);
    }

}