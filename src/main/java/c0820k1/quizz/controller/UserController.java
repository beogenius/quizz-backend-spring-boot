package c0820k1.quizz.controller;

import c0820k1.quizz.model.entities.User;
import c0820k1.quizz.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admin/user/api")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserService userService;
    Response res = new Response();

    public Response get(){
        List<User> userList = userService.getAll();
        res.data = userList;
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }

}
