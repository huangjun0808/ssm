package com.weshine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 类@
 *
 * @author huangjun
 * &date 2017/11/3
 */
@Controller
public class AuthController extends BaseController {

    @RequestMapping(value = {"login"}, method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error",required = false) String error,@RequestParam(value = "logout",required = false) String logout){
        ModelAndView mv = new ModelAndView();
        if (error != null) {
            mv.addObject("error", "Invalid username and password!");
        }

        if (logout != null) {
            mv.addObject("msg", "You've been logged out successfully.");
        }
        mv.setViewName("auth/login");
        return mv;
    }
}
