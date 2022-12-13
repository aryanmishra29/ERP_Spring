package ERP.studentERP.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ERP.studentERP.domain.Student;

@Controller
public class UpdatedRegistrationController {
	@RequestMapping("/home")
	public String index(Model model) {
		model.addAttribute("formData",new Student());
		return "Index";
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String formCreation(Student student) {
		return("result");
	}
	
}
