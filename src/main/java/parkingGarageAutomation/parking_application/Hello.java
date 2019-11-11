package parkingGarageAutomation.parking_application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Hello 
{
    @Autowired
    CustReg custreg;
    @Autowired
    MongoDbController mdbcon;

	@RequestMapping("/")
    public String homepage() {
        custreg.setEmail("sai@gmail.com");
        custreg.setGender("male");
        custreg.setPassword1("hello");
        custreg.setPassword2("hello");
        custreg.setPhone("123456");
        custreg.setUsername("saisantosh");
        mdbcon.save(custreg);
        return "homepage.html";
    }

}
