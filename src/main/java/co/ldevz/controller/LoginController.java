package co.ldevz.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.ldevz.model.Login;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET, path="/login")
	public String getHome() {
		return "You can";
	}
	/*@RequestMapping(method= RequestMethod.GET, path="/santo")

    public Login olaBot() {

          return new Login( "Deus", "É Maravilhoso");

    }
	*/
	@CrossOrigin
	@RequestMapping(method= RequestMethod.GET, path="/hello/{isLogout}")
    public Login olaLog( @PathVariable("isLogout") String isLogout) {

          Login b = new Login( isLogout, isLogout);

          if(isLogout.contains("oi")) {
              b.setIsLogout("Oi para você também humano!");


                 return b;

          }else {

                 b.setIsLogout("Olá Humano, posso ajudar?");

                  return b;
                  

          }
         

    }


}
