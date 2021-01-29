package c0820k1.quizz.controller;

import c0820k1.quizz.model.entities.User;
import c0820k1.quizz.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin/user")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserService userService;
    Response res = new Response();

    @GetMapping()
    public List<User> getAll(){
        List<User> userList = userService.getAll();
        res.data = userList;
        res.status = res.SUCCESS;
        res.message = "Success";
        return userList;
    }

    @GetMapping("user")
    public Response getUser(@RequestParam Integer id){
        res.data = userService.findById(id);
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }

    @PostMapping("/create")
    public Response save(@RequestBody User u){
        User user = userService.save(u);
        res.data = user;
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }

    @DeleteMapping()
    public Response delete(@RequestParam Integer id){
        User user = userService.delete(id);
        res.data = user;
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }

    @PutMapping("/update")
    public Response update(@RequestBody User u){
        User user = userService.save(u);
        res.data = user;
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }

}
