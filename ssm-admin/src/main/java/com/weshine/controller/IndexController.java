package com.weshine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 类@
 *
 * @author huangjun
 * &date 2017/11/23
 */
@Controller
public class IndexController extends BaseController{

    @RequestMapping({"/index"})
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }


}
