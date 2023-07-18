package springsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController 
{
	 @RequestMapping("/complex")
	  public  String showForm()
	  {
		  return "complex_form";
	  }
	
	 
	 @RequestMapping(value = "/handleform", method = RequestMethod.POST)
	 public String formhandle(@ModelAttribute("student") Student student)
	 {
		 System.out.println(student);
		
		 return"success";
	 }

}
