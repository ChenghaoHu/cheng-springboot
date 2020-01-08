package com.example.cheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@Controller
public class ChengApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChengApplication.class, args);
    }

    @RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
    public String index(Model model){
        model.addAttribute("msg", "hello world! the first spring boot project。");
        return "index";
    }

}
