package c0820k1.quizz.controller;

import c0820k1.quizz.model.entities.AppGroup;
import c0820k1.quizz.model.services.AppGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admin/group/api")
@CrossOrigin(origins = "*")
public class AppGroupController {
    @Autowired
    private AppGroupService appGroupService;
    Response res = new Response();

    @GetMapping()
    public Response getAll(){
        List<AppGroup> appGroupList = appGroupService.getAll();
        res.data = appGroupList;
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }
}
