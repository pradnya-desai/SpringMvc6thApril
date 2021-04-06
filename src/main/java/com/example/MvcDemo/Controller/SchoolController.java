package com.example.MvcDemo.Controller;

import com.example.MvcDemo.Model.School;
import com.example.MvcDemo.Repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SchoolController {
    @Autowired
    private SchoolRepository schoolRepository;

    @GetMapping("/homepage")
        public String showSchool(Model model){
       model.addAttribute("school", new School());
        //schoolRepository.save(school);
        return "schoolindex";
    }


   @PostMapping(value="/saveSchool")
    public String saveSchool(@ModelAttribute School school) {
       System.out.println(school);
       //model.addAttribute("saveSchool",school);
       schoolRepository.save(school);
       return "success";
  }
   }
