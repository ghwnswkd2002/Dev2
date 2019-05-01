package dev2.springboot.groupware.Main.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class MainController {

    public static Logger logger = LoggerFactory.getLogger(MainController.class);




    @GetMapping("/hello")
    public String hello(Model model) {
        logger.info("여기들어옴");
        logger.info("아아아");

        model.addAttribute("test2", "아아 테스트 테스트");
        return "hello";
    }
}
