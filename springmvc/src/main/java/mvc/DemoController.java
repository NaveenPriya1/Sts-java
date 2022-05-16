package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
  
	@RequestMapping("/first")
	public String displayId(HttpServletRequest req,HttpServletResponse res) {
		return req.getParameter("id");
	}
	@RequestMapping("/second")
	public String displayName(HttpServletRequest req,HttpServletResponse res) {
		return req.getParameter("name");
	}


}
