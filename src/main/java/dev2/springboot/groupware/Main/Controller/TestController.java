package dev2.springboot.groupware.Main.Controller;


import dev2.springboot.groupware.Main.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    MemberService memberService;


    @GetMapping("login")
    public String login(){
        return "/login";
    }


    @PostMapping("loginLogic")
    @ResponseBody
    public String loginLogic(String id, String pass){

        String result = memberService.loginCheck(id, pass);

        return result;

    }
}
