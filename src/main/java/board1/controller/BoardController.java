package board1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import board1.service.BoardService;

@Controller
public class BoardController {
//	@Autowired
//	private BoardService bs;
	
	@RequestMapping("/main")
	public String main() {
		return "redirect:main";
	}
}
