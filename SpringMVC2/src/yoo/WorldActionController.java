package yoo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class WorldActionController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			                                              HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("WorldActionController의 handleRequest()호출됨!");
		ModelAndView mav=new ModelAndView(); 
		mav.setViewName("world");//이동할 페이지명->경로X ,파일의 확장자도 X
		mav.addObject("message2","클릭둘!"); //${message2}
		return mav; 
	}
}




