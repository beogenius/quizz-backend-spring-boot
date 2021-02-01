package c0820k1.quizz.controller;

import c0820k1.quizz.model.entities.Exam;
import c0820k1.quizz.model.services.UserService;
import c0820k1.quizz.model.services.hieu.IExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/admin/exam")
public class ExamController {
    @Autowired
    private IExamService examService;

//    @Autowired
//    private UserService userService;

    @GetMapping("/all")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public List<Exam> getExam() {
        return (List<Exam>) examService.findAll();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Exam getProduct(@PathVariable("id") int id) {
        Optional<Exam> exam = examService.findById(id);
        if (exam.isPresent()) {
            return examService.findById(id).get();
        }
        return null;
    }

    @PostMapping("/create")
//    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER') ")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<Exam> createProduct(@RequestBody Exam exam) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        User user = userService.findByUsername(authentication.getName()).get();
//        Product product = new Product();
//        product.setTitle(exam.getTitle());
//        product.setDescription(exam.getDescription());
//        product.setUser(user);
//        try {
//            productService.save(product);
//            return new ResponseEntity<>(product,HttpStatus.OK);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }

        try {
            examService.save(exam);
            return new ResponseEntity<>(exam,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") int id) {
        examService.remove(id);
        return new ResponseEntity<>("Product has been removed",HttpStatus.OK);
    }
    @PostMapping("/removeList")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Exam>> removeExams(@RequestBody List<Exam> exams) {
        for(Exam exam: exams) {
            examService.remove(exam.getId());
        }
        return new ResponseEntity<>(exams,HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Exam> updateProduct(@PathVariable("id") int id, @RequestBody Exam exam) {
        Optional<Exam> oldExam = examService.findById(id);
        if (oldExam.isPresent()) {
            oldExam.get().setExamName(exam.getExamName());
            examService.save(oldExam.get());
            return new ResponseEntity<>(oldExam.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
