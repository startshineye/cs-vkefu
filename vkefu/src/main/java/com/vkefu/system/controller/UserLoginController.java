package com.vkefu.system.controller;

import com.vkefu.webim.web.beans.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户登录
 * created by yxm 2018-06-16 12:10:21
 */
@Controller
@RequestMapping("/vkefu/user")
public class UserLoginController {

    public static Map<String,String> userMap = new HashMap<String,String>();
    public static Map<String,User> onlineUserMap = new HashMap<String,User>();
    static {
        userMap.put("admin","123456");
        userMap.put("zs","123456");
        userMap.put("lisi","123456");
        userMap.put("wangwu","123456");
        onlineUserMap.put("123",new User("admin","123456"));
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView login(@RequestParam(value = "username",required = true) String name,
                              @RequestParam(value = "pwd",required = true) String pwd,ModelAndView modelAndView,
                              HttpServletRequest request){
        String passworrd = userMap.get(name);
        String sessionid = request.getSession().getId() ;
        if(pwd.equals(passworrd)){
            modelAndView.setViewName("apps/menu/menu");
            modelAndView.addObject("userId",name);
            modelAndView.addObject("pwd",pwd);
            modelAndView.addObject("sessionid",sessionid);
            return modelAndView;
        }
        return null;
    }

}
