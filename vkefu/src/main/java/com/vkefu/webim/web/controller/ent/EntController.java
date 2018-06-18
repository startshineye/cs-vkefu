package com.vkefu.webim.web.controller.ent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/vkefu/ent")
public class EntController {

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public ModelAndView index(HttpServletRequest request){
        String userId = request.getParameter("userId");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("apps/entim/chat");
        modelAndView.addObject("userId",userId);
        return modelAndView;
    }
}
