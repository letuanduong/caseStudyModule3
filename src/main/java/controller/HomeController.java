package controller;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import service.IService;
import service.impl.AdminServiceImpl;
import service.impl.ProductServiceImpl;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private IService<Product> productIService;

    @GetMapping("/")
    public String home(Model model){
        return "index";
    }

    @GetMapping("/admin/")
    public String admin(Model model){
        return "admin";
    }

    @GetMapping("/user/")
    public String user(Model model){
        return "user";
    }

//    @GetMapping("/calendar")
//    public String calendar(){
//        return "/admin/calendar";
//    }
//
//    @GetMapping("test")
//    public ModelAndView viewTest(){
//        ModelAndView mv = new ModelAndView("viewTest");
//        List<Product> products = productIService.findAll();
//        mv.addObject("products", products);
//        return mv;
//    }


}
