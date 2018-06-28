package com.vkefu.system.controller.menu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/vkefu/menu")
public class MenuController {

    @RequestMapping(value = "/single",method = RequestMethod.GET)
    public ModelAndView single(ModelAndView modelAndView,
                              HttpServletRequest request){
        String sessionid = request.getSession().getId();
        String userId = request.getParameter("userId");
        String pwd = request.getParameter("pwd");

        modelAndView.setViewName("apps/im/chat");
        modelAndView.addObject("userId",userId);
        modelAndView.addObject("pwd",pwd);
        modelAndView.addObject("sessionid",sessionid);
        return modelAndView;
    }

    @RequestMapping(value = "/group",method = RequestMethod.GET)
    public ModelAndView group(ModelAndView modelAndView,
                              HttpServletRequest request){
        String sessionid = request.getSession().getId();
        String userId = request.getParameter("userId");
        String pwd = request.getParameter("pwd");

        modelAndView.setViewName("apps/entim/chat");
        modelAndView.addObject("userId",userId);
        modelAndView.addObject("pwd",pwd);
        modelAndView.addObject("sessionid",sessionid);
        return modelAndView;
    }
}
