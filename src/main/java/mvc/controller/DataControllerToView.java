package mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DataControllerToView 
{
	
	//  Data Passing to View Using Model
	
	@RequestMapping(value= {"/","home"})
	public String indexPage(Model model)
	{
		model.addAttribute("Name","Ghost");
		return "index";
	}
	
	@RequestMapping("/info")
	public String aboutPage(Model model)
	{
		List<String> weapons = new ArrayList<String>();
		
		weapons.add("G-136");
		weapons.add("Mp3-500");
		weapons.add("Ak-104");
		
		model.addAttribute("Weapons",weapons);
		return "about";
	}
	
	
	//   Data Passing to View Using ModelAndView
	
	@RequestMapping("/service")
	public ModelAndView servicePage()
	{
		ModelAndView mav=new ModelAndView();
		LocalDateTime current = LocalDateTime.now();
		
		mav.addObject("services","This is service page Controller");
		mav.addObject("time",current);
		
		// setting View Name 
		mav.setViewName("Services");
		
		return mav;
	}
	
	@RequestMapping("/jstl")
	public ModelAndView jstlDemo()
	{
		ModelAndView mav=new ModelAndView();
		ArrayList<String> powerfulCharacters = new ArrayList<>();
		
		mav.addObject("names","Powerful Charaters names");
		
		powerfulCharacters.add("Minato Namikaze");
		powerfulCharacters.add("Saitama");
		powerfulCharacters.add("Son Goku");
		powerfulCharacters.add("Vegeta");
		powerfulCharacters.add("Ryumen Sukuna");
		
		mav.addObject("characters",powerfulCharacters);
		
		mav.setViewName("jstl_demo");
		
		return mav;
		
		
		
	}
}
