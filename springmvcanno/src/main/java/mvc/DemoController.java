package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	    
	@ResponseBody
	@RequestMapping("/first")

		public String displayId(HttpServletRequest req,HttpServletResponse res) {
			return req.getParameter("id");
		}
	
	@ResponseBody	
	@RequestMapping("/second")
    public String displayName(HttpServletRequest req,HttpServletResponse res) {
			return req.getParameter("name");
		}
	}

}
