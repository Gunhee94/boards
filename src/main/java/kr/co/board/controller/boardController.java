package kr.co.board.controller;

import kr.co.board.service.BoardService;
import kr.co.board.vo.Board;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class boardController {

    private BoardService boardService;


    @RequestMapping("/main.do")
    public String main() {
        Board b = boardService.getBoardByNo(10000);
        System.out.println("되낭" + b.toString());
        return "index";


    }
}
