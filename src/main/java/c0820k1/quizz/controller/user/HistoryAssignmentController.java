package c0820k1.quizz.controller.user;

import c0820k1.quizz.controller.Response;
import c0820k1.quizz.model.entities.HistoryAssignment;
import c0820k1.quizz.model.entities.Question;
import c0820k1.quizz.model.entities.User;
import c0820k1.quizz.model.services.HistoryAssignmentService;
import c0820k1.quizz.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user/assign/api")
@CrossOrigin(origins = "*")
public class HistoryAssignmentController {

    @Autowired
    private HistoryAssignmentService historyAssignmentService;

    @Autowired
    private UserService userService;

    Response res = new Response();


    @GetMapping("")
    public List<HistoryAssignment> getAllByUserId(@RequestParam int id){

        User user = userService.findById(id);
        List<HistoryAssignment> historyAssignments = historyAssignmentService.findAllByUser(user);
        res.data = historyAssignments;
        res.status = res.SUCCESS;
        res.message = "Success";
        return historyAssignments;
    }
}
