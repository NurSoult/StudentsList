package kz.bitlab.springboot.springsprinttask1.controller;


import kz.bitlab.springboot.springsprinttask1.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String indexPage(Model model) {

        ArrayList<Student> students = DBManager.getStudents();
        model.addAttribute("students", students);

        return "index";
    }

    @GetMapping(value = "/add-student-page")
    public String addStudentPage() {
        return "add_student";
    }

    @PostMapping(value = "/add-student")
    public String addStudent(Student student) {
        DBManager.addStudent(student);
        return "redirect:/";
    }


}
