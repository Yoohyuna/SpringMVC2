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
		System.out.println("HelloActionController�� handleRequest()ȣ���!");
		ModelAndView mav=new ModelAndView(); 
		mav.setViewName("hello");//�̵��� ��������->���X ,������ Ȯ���ڵ� X
		mav.addObject("message","Ŭ���ϳ�!");
		return mav; 
	}
}




