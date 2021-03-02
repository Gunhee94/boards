package kr.co.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class boardController {

    @RequestMapping("/main.do")
    public String main() {
        return "index";
    }
}
