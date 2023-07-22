package springsearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FindUploadController 
{
	
	@RequestMapping("/fileform")
	public String showForm()
	{
		return"fileForm";
	}
	
	@RequestMapping(value="/uploadimage", method = RequestMethod.POST)
	public String uplodFile(@RequestParam("profile") CommonsMultipartFile file,HttpSession s, Model m)
	{
		System.out.println("in uploadFile()");
		System.out.println(file.getSize());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		
		byte data[]=file.getBytes();
		String path =s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator + "image"
		+ File.separator + file.getOriginalFilename();
		try {
			FileOutputStream f=new FileOutputStream(path);
			f.write(data);
			f.close();
			
			System.out.println("fileuploaded successfully");
			m.addAttribute("filename",file.getOriginalFilename());
			m.addAttribute("msg","uploaded success");	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("uploding error");
			m.addAttribute("msg","uploaded error");
			
		}
		
	
	System.out.println("in uploadFile() path:"+path);
		return"fileSuccess";
	}


}
