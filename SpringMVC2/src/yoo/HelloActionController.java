package yoo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class HelloActionController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			                                              HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("HelloActionController의 handleRequest()호출됨!");
		ModelAndView mav=new ModelAndView(); 
		mav.setViewName("hello");//이동할 페이지명->경로X ,파일의 확장자도 X
		mav.addObject("message","클릭하나!");
		return mav; 
	}
}




