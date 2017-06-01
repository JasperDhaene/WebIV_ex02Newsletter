/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.FrameworkBean;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author jasper
 */
@Controller
public class UserController {
    
    @Autowired
    public FrameworkBean frameworkBean;
    
    
    @RequestMapping(value = {"/user"}, method = RequestMethod.GET)
    public String showHomePage(Model model) {
        User user = new User();
        //already check first checkbox
        user.setFavFrameworks(frameworkBean.getWebFrameworkList().subList(0, 1));
        model.addAttribute("user", user);
        model.addAttribute("favFrameworks", frameworkBean.getWebFrameworkList());
        return "userForm";
    }
    
    @RequestMapping(value = {"/user"}, method = RequestMethod.POST)
    public String showResult(Model model,@ModelAttribute("user") User result) {
        model.addAttribute("user", (User) result);
        return "resultView";
    }

}
