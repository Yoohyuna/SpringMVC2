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
		System.out.println("WorldActionController�� handleRequest()ȣ���!");
		ModelAndView mav=new ModelAndView(); 
		mav.setViewName("world");//�̵��� ��������->���X ,������ Ȯ���ڵ� X
		mav.addObject("message2","Ŭ����!"); //${message2}
		return mav; 
	}
}




