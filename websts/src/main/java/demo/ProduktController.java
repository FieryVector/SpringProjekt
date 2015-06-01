package demo;

import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProduktController {

	private final ProduktService produktService;
	
	@Autowired
	public ProduktController(ProduktService produktService)
	{
		this.produktService = produktService;
	}
	
	@RequestMapping(value="/index")
	public String index()
	{
		return "index";
	}
}
