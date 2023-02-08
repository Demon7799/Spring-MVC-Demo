package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import mvc.model.FormData;

@Controller
public class DataViewToController {
	@RequestMapping("/form")
	public String form() {
		return "SignUpForm";
	}

	// we can use below method to get data from views but this is a lengthy process
	// and we have to write to much code

	/*
	 * @RequestMapping(path = "/register", method = RequestMethod.POST) 
	 * public String handleForm(@RequestParam("userName") String userName, 
	 * @RequestParam("userMail") String userMail,
	 * @RequestParam("userPhone") String userPhone, 
	 * Model model) 
	 * {
	 * model.addAttribute("name",userName); model.addAttribute("mail",userMail);
	 * model.addAttribute("phone",userPhone); return "success"; 
	 * }
	 */
	
	// So We will use @ModelAttribute
	
	@RequestMapping(path="/register",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute FormData frmData,Model model)
	{
		System.out.println(frmData);
		model.addAttribute("frmData",frmData);
		return "success";
	}
	

}
