package net.daum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

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
	
	@GetMapping("/git_test2")
	public String git_test2(HttpServletRequest request) {
		String[] cityNameArr= {"서울시","부산시"};
		
		request.setAttribute("cityNameArr", cityNameArr); //좌측 cityNameArr키이름에 cityNameArr 배열저장
		return "git_Test2"; //뷰페이지 경로가 /WEB-INF/views/git_Test2.jsp
	}
	
}
