package net.daum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GitController {

	@GetMapping("/git_test")
	public ModelAndView get_test() {
		
		int[] javaArr= {100,100,100};
		
		ModelAndView gm = new ModelAndView("git_Test");
		//생성자 인자값으로 뷰리졸브 경로 설정 => /WEB-INF/views/git_Test.jsp
		gm.addObject("javaArr",javaArr); //키, 값 저장
		return gm;
	}//get_test()
}
