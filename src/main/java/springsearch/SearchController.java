package springsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class SearchController
{    
	
	@RequestMapping("/user/{id}")
	public String getUserDetails(@PathVariable("id") int id)
	{
		
		System.out.println(id);
		return "home";
	}
	@RequestMapping("/home")
	public String Home()
	{   
		
		String s=null;
		System.out.println(s.length());
		
		System.out.print("goign to home controller  view ");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam ("querybox") String query)
	{
		
		String url="https://www.google.com/search?q=" +query;
		RedirectView redirectView=new RedirectView();
		
		redirectView.setUrl(url);
		return redirectView;
	}
	
	@ExceptionHandler({NumberFormatException.class,NullPointerException.class})
	public String nullExceptionHandler()
	{
		return "null_page";
	}

}
